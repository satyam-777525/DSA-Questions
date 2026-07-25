class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int dp[][]=new int[n][amount+1];
        for(int y[]:dp){
            Arrays.fill(y,-1);
        }
        int ans=helper(n-1,amount,coins,dp);
        if(ans==(int)1e9){
            return -1;
        }
        return ans;
    }
    public static int helper(int idx,int target,int num[],int dp[][]){
        if(idx==0){
            if(target%num[idx]==0) return target/num[idx];
            return (int)1e9;
        }
        if(dp[idx][target]!=-1) return dp[idx][target];
        int notpick=helper(idx-1,target,num,dp);
        int pick=(int)1e9;
        if(num[idx]<=target){
            pick=1+helper(idx,target-num[idx],num,dp);
        }
        return dp[idx][target]= Math.min(pick,notpick);
    }
}