class Solution {
    public int numDistinct(String str, String sub) {
        // int n=s.length();
        // int m=t.length();
        // int dp[][]=new int[n][m];
        // for(int x[]:dp){
        //     Arrays.fill(x,-1);
        // }
        // int ans=helper(n-1,m-1,s,t,dp);
        // return ans;
        int mod=1000000007;
        int n=str.length();
        int m=sub.length();
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<=n;i++) dp[i][0]=1;
        for(int j=1;j<=m;j++) dp[0][j]=0;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(str.charAt(i-1)==sub.charAt(j-1)){
                     dp[i][j] = (int)(((long)dp[i - 1][j - 1] + dp[i - 1][j]) % mod);
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][m];
    }
    // public static int helper(int idx1,int idx2,String s,String t,int dp[][]){
    //     if(idx2<0) return 1;
    //     if(idx1<0) return 0;
    //     if(dp[idx1][idx2]!=-1) return dp[idx1][idx2];
    //     if(s.charAt(idx1)==t.charAt(idx2)){
    //         return helper(idx1-1,idx2-1,s,t,dp)+helper(idx1-1,idx2,s,t,dp);
    //     }
    //     return helper(idx1-1,idx2,s,t,dp);
    // }
}