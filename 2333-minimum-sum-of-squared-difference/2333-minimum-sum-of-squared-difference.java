// this code give tle
// class Solution {
//     public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
//         int n=nums1.length;
//         long k=(long) k1+k2;

//         PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

//         long total=0;
//         for(int i=0;i<nums1.length;i++){
//             int diff=Math.abs(nums1[i]-nums2[i]);
//             pq.add(diff);
//             total+=diff;
//         }

//         if(total<=k){
//             return 0;
//         }

//         while(k>0){
//             int max=pq.poll();
//             if(max>0){
//                 pq.add(max-1);
//                 k--;
//             }else{
//                 pq.add(max);
//                 break;
//             }
//         }
//         long ans=0;
//         while(!pq.isEmpty()){
//             long diff=pq.poll();
//             ans+=diff*diff;
//         }
//         return ans;
//     }
// }


class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        long k = (long) k1 + k2;

        int[] diff = new int[n];
        int maxDiff = 0;
        long total = 0;

        for (int i = 0; i < n; i++) {
            diff[i] = Math.abs(nums1[i] - nums2[i]);
            maxDiff = Math.max(maxDiff, diff[i]);
            total += diff[i];
        }

        if (total <= k) {
            return 0;
        }

        int low = 0, high = maxDiff;

        while (low < high) {
            int mid = low + (high - low) / 2;
            long operations = 0;

            for (int d : diff) {
                if (d > mid) {
                    operations += d - mid;
                }
            }

            if (operations <= k) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        int level = low;
        long operations = 0;
        long ans = 0;

        for (int d : diff) {
            operations += Math.max(0, d - level);
            long reduced = Math.min(d, level);
            ans += reduced * reduced;
        }

        long remaining = k - operations;
        ans -= remaining * (2L * level - 1);

        return ans;
    }
}