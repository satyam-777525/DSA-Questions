class Solution {
    public int stoneGameV(int[] stoneValue) {
        int n=stoneValue.length;
        int dp[][]=new int[n][n];
        for(int x[]:dp){
            Arrays.fill(x,-1);
        }
        int ans=helper(0,n-1,stoneValue,dp);
        return ans;
        
    }
    public int helper(int i,int j,int[]arr,int dp[][]){
        if(i>=j) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int total=0;
        for(int k=i;k<=j;k++){
            total+=arr[k];
        }
        int ans=0;
        int left=0;
        for(int k=i;k<=j;k++){
            left+=arr[k];
            int right=total-left;

            if(left<right){
                ans=Math.max(ans,left+helper(i,k,arr,dp));
            }
            else if(left>right){
                ans=Math.max(ans,right+helper(k+1,j,arr,dp));
            }else{
                ans=Math.max(ans,left+Math.max(helper(i,k,arr,dp),helper(k+1,j,arr,dp)));
            }
        }
        return dp[i][j]=ans;
    }
}