class Solution {
    public int maxValueOfCoins(List<List<Integer>> piles, int k) {
        int n=piles.size();
        int dp[][]=new int[n][k+1];
        for(int x[]:dp){
            Arrays.fill(x,-1);
        }
        int ans=helper(0,k,piles,dp);
        return ans;
    }
    public int helper(int idx,int k,List<List<Integer>> piles,int dp[][]){
        if(k==0){
            return 0;
        }
        if(idx==piles.size()){
            return 0;
        }
        if(dp[idx][k]!=-1) return dp[idx][k];
        int ans=0;
        int sum=0;
        int maxtake=Math.min(k,piles.get(idx).size());
        for(int i=0;i<=maxtake;i++){
            if(i>0){
                sum+=piles.get(idx).get(i-1);
            }
            int value=sum+helper(idx+1,k-i,piles,dp);
            ans=Math.max(ans,value);
        }
        return dp[idx][k]= ans;
    }

}