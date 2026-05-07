class Solution {
    public int[] maxValue(int[] nums) {
        int n=nums.length;
        int pre[]=new int[n];
        int suffi[]=new int[n];

        pre[0]=nums[0];
        suffi[n-1]=nums[n-1];
        for(int i=1;i<n;i++){
            pre[i]=Math.max(pre[i-1],nums[i]);
        }

        for(int i=n-2;i>=0;i--){
            suffi[i]=Math.min(suffi[i+1],nums[i]);
        }
        int ans[]=new int[n];
        ans[n-1]=pre[n-1];
        for(int i=n-2;i>=0;i--){
            if(pre[i]>suffi[i+1]){
                ans[i]=ans[i+1];
            }else{
                ans[i]=pre[i];
            }
        }
        return ans;
    }
}