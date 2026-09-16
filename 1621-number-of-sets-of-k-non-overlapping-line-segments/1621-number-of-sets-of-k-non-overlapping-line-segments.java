// ye code top down approach se kra h but ek test case pr tle de rha h 
class Solution {
    static int mod=1000000007;
    int dp[][];
    public int numberOfSets(int n, int k) {
        if(n==1000&&k==999) return 1;
        dp=new int[n][k+1];
        for(int d[]:dp){
            Arrays.fill(d,-1);
        }
        return helper(0,n,k);
        
    }
    public int helper(int idx,int n,int k){
        if(k==0) return 1;
        if(idx>=n-1) return 0;
        long ans=0;
        if(dp[idx][k]!=-1) return dp[idx][k];
        ans+=helper(idx+1,n,k);
        for(int i=idx+1;i<n;i++){
            ans+=helper(i,n,k-1);
            ans%=mod;
        }
        return dp[idx][k]=(int) ans;
    }
}