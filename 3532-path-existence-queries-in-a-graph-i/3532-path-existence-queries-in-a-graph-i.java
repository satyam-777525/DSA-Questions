// class Solution {
//     public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
//         int l=queries.length;
//         boolean ans[]=new boolean[l];
//         for(int i=0;i<l;i++){
//             int q[]=queries[i];
//             int x=q[0];
//             int y=q[1];
//             int diff=Math.abs(nums[x]-nums[y]);
//             if(diff<=maxDiff){
//                 ans[i]=true;
//                 continue;
//             }
//             if(x<y){
//                 for(int j=x+1;j<y;j++){
//                     int diff1=Math.abs(nums[x]-nums[j]);
//                     int diff2=Math.abs(nums[j]-nums[y]);
//                     if(diff1<=maxDiff && diff2<=maxDiff){
//                         ans[i]=true;
//                         break;
//                     }
//                 }
//             }else if(x>y){
//                 for(int j=x-1;j>y;j--){
//                     int diff1=Math.abs(nums[x]-nums[j]);
//                     int diff2=Math.abs(nums[j]-nums[y]);
//                     if(diff1<=maxDiff && diff2<=maxDiff){
//                         ans[i]=true;
//                         break;
//                     }
//                 }
//             }
            
//         }
//         return ans;
//     }
// }
class Solution {
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
        int c[]=new int[n];
        c[0]=1;
        for(int i=1;i<n;i++){
            if(Math.abs(nums[i]-nums[i-1])<=maxDiff){
                c[i]=c[i-1];
            }else{
                c[i]=c[i-1]+1;
            }
        }
        boolean [] ans=new boolean[queries.length];
        int i=0;
        for(int q[]:queries){
            if(c[q[0]]==c[q[1]]){
                ans[i]=true;
            }
            i++;
        }
        return ans;
    }
}