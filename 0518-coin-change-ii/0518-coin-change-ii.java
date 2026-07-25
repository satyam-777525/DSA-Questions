class Solution {
    public int change(int amount, int[] coins) {
        int n=coins.length;
		int dp[][]=new int[n][amount+1];
		for(int d[]:dp){
			Arrays.fill(d,-1);
		}
		int ans=helper(n-1,amount,coins,dp);	
		return ans;
    }
    public static int helper(int idx,int target,int nums[],int dp[][]){
		if(idx==0){
			if(target%nums[idx]==0) return 1;
			return 0;
		}
		if(dp[idx][target]!=-1) return dp[idx][target];
		int notpick=helper(idx-1,target,nums,dp);
		int pick=0;
		if(nums[idx]<=target){
			pick=helper(idx,target-nums[idx],nums,dp);
		}
		return dp[idx][target]=pick+notpick;

	}
}