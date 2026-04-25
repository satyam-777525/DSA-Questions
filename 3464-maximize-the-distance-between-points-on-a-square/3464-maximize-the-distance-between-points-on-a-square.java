// // mera logic tle de rha h 
// class Solution {
//     public int maxDistance(int side, int[][] points, int k) {
//         int n=points.length;
//         long pos[]=new long[n];
//         for(int i=0;i<n;i++){
    
//             int x=points[i][0];
//             int y=points[i][1];
//             if(y==0)pos[i]=x;
//             else if(x==side)pos[i]=side+y;
//             else if(y==side)pos[i]=3L*side-x;
//             else pos[i]=4L*side-y;
//         }
//         Arrays.sort(pos);
//         int low=0;
//         int high=side;
//         int ans=0;
//         while(low<=high){
//             int mid=low+(high-low)/2;
//             if(pick(pos,k,mid,side)){
//                 ans=mid;
//                 low=mid+1;
//             }else{
//                 high=mid-1;
//             }
//         }
//         return ans;
//     }
//    public boolean pick(long[] pos, int k, int dist, int side) {
//         int n = pos.length;
//         long perimeter = 4L * side;

//         // circular traversal ke liye duplicate array
//         long[] arr = new long[2*n];
//         for (int i=0;i<n;i++) {
//             arr[i]=pos[i];
//             arr[i+n]=pos[i]+perimeter;
//         }

//         // har point ko start man ke check
//         for (int start=0;start<n;start++){
//             int count=1;
//             long first=arr[start];
//             long last=arr[start];

//             for (int i=start+1;i<start+n && count<k;i++){
//                 if (arr[i]-last>=dist){
//                     count++;
//                     last =arr[i];
//                 }
//             }

//             // first aur last ka circular gap check
//             if (count>=k && perimeter-(last-first)>=dist){
//                 return true;
//             }
//         }

//         return false;
//     }
// }
class Solution {
    public int maxDistance(int side, int[][] points, int k) {
        long[] res = new long[points.length];
        long lSide = (long) side;

        for (int i = 0; i < points.length; i++) {
            long x = points[i][0];
            long y = points[i][1];
            if (x == 0) res[i] = y;
            else if (y == lSide) 
                res[i] = lSide + x;
            else if (x == lSide) 
                res[i] = lSide * 3 - y;
            else res[i] = lSide * 4 - x;
        }
        Arrays.sort(res);

        int left = 1;
        int right = (int) ((lSide * 4) / k) + 1;
        
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (check(mid, res, lSide, k)) 
                left = mid;
            else right = mid;
        }
        return left;
    }

    private boolean check(int n, long[] res, long lSide, int k) {
        int m = res.length;
        int[] idx = new int[k];
        long perimeter = lSide * 4;
        
        idx[0] = 0;
        long curr = res[0];
        for (int i = 1; i < k; i++) {
            int pos = Arrays.binarySearch(res, curr + n);
            if (pos < 0) 
                pos = -(pos + 1);
            if (pos == m) 
                return false;
            idx[i] = pos;
            curr = res[pos];
        }
        
        if (res[idx[k - 1]] - res[0] <= perimeter - n) 
            return true;

        for (idx[0] = 1; idx[0] < idx[1]; idx[0]++) {
            for (int j = 1; j < k; j++) {
                while (idx[j] < m && res[idx[j]] < res[idx[j - 1]] + n) {
                    idx[j]++;
                }
                if (idx[j] == m) 
                    return false;
            }
            if (res[idx[k - 1]] - res[idx[0]] <= perimeter - n) 
                return true;
        }
        return false;
    }
}