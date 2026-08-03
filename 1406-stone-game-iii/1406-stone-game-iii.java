class Solution {
    int dp[];
    public String stoneGameIII(int[] stoneValue) {
        int n=stoneValue.length;
        dp=new int[n];
        Arrays.fill(dp,-1);
        int x=helper(0,stoneValue);
        if(x>0){
            return "Alice";
        }
        if(x<0){
            return "Bob";
        }
        else{
            return "Tie";
        }
    }
    public  int helper(int i,int[] piles){
        if(i>=piles.length){
            return 0;
        }
        if(dp[i]!=-1) return dp[i];
        int ans=Integer.MIN_VALUE;
        int take=0;
        for(int k=0;k<3&&i+k<piles.length;k++){
            take+=piles[i+k];
            ans=Math.max(ans,take-helper(i+k+1,piles));
        }
        return dp[i]=ans;
    }
}