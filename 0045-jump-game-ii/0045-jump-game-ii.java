class Solution {
    public int jump(int[] nums) {
        int dp[]=new int [nums.length];
        Arrays.fill(dp,-1);
        return helper(nums,0,dp);
    }
    public int helper(int nums[],int idx,int[]dp){
        int n=nums.length;
        if(idx>=n-1){
            return 0;
        }
        if(dp[idx]!=-1){
            return dp[idx];
        }
        int ans=Integer.MAX_VALUE/2;
        for(int jump=1;jump<=nums[idx];jump++){
            ans=Math.min(ans,1+helper(nums,idx+jump,dp));
        }
        return dp[idx]=ans;
    }
}