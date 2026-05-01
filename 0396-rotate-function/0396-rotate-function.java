class Solution {
    public int maxRotateFunction(int[] nums) {
        int n=nums.length;
        int sum=0;
        int f=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            f+=(int)nums[i]*i;
        }
        int ans=f;
        for(int i=1;i<n;i++){
            f=f+sum-n*nums[n-i];
            ans=Math.max(ans,f);
        }
        return  ans;
    }
}