// this is the extension of leetcode best time to buy and sell stock 2(infinite trade allow)
class Solution {
    public int maxProfit(int[] prices) {
         int n=prices.length;
        int dp[][]=new int[n][2];
        for(int x[]:dp){
            Arrays.fill(x,-1);
        }
        return helper(0,1,prices,n,dp);
        
    }
        public static int helper(int idx,int buy,int []values,int n,int dp[][]){
        if(idx>=n) return 0;
        if(dp[idx][buy]!=-1) return (int)dp[idx][buy];
        int profit=0;
        if(buy==1){
            profit=Math.max(-values[idx]+helper(idx+1,0,values,n,dp),helper(idx+1,1,values,n,dp));
        }else{
            profit=Math.max(values[idx]+helper(idx+2,1,values,n,dp),helper(idx+1,0,values,n,dp));// change idx+2 kyuki ek sell ke bad just pass wala buy nhi karenge
        }
        return dp[idx][buy]=profit;
    }
}


