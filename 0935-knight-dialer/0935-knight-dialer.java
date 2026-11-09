class Solution {
    int mod = 1000000007;
     int[][] moves = {{4, 6},{6, 8},{7, 9},{4, 8},{0, 3, 9},{},{0, 1, 7},{2, 6},{1, 3},{2, 4}};
     int dp[][];
    public int knightDialer(int n) {
        dp=new int[10][n+1];

        for(int i=0;i<10;i++){
            Arrays.fill(dp[i],-1);
        }
        long ans=0;
        for(int digit=0;digit<10;digit++){
            ans+=solve(digit,n-1);
            ans=ans%mod;
        }
        return (int) ans;
    }
    public int solve(int digit,int rem){
        if(rem==0) return 1;

        if(dp[digit][rem]!=-1){
            return dp[digit][rem];
        }
        long ans=0;
        for(int next:moves[digit]){
            ans+=solve(next,rem-1);
            ans=ans%mod;
        }
        return dp[digit][rem]=(int)ans;
    }
}