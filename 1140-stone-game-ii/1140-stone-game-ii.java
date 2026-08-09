class Solution {
    public int stoneGameII(int[] piles) {
        int n=piles.length;
        int suffix[]=new int[n+1];
        int dp[][]=new int[n][n+1];
        for(int x[]:dp){
            Arrays.fill(x,-1);
        }
        for(int i=n-1;i>=0;i--){
            suffix[i]=suffix[i+1]+piles[i];
        }
        int ans=helper(0,1,piles,suffix,dp);
        return ans;
    }
    public int helper(int i,int m,int piles[],int suffix[],int dp[][]){
        if(i>=piles.length) return 0;
        if(2*m>=piles.length-i){
            return suffix[i];
        }
        if(dp[i][m]!=-1) return dp[i][m];
        int ans=0;
        int sum=0;
        for(int x=1;x<=2*m;x++){
            sum+=piles[i+x-1];
            int opp=helper(i+x,Math.max(m,x),piles,suffix,dp);
            int curr=suffix[i]-opp;
            ans=Math.max(ans,curr);
        }
        return dp[i][m]=ans;
    }
}