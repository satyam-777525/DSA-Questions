class Solution {
     Boolean dp[][];
    public boolean checkValidString(String s) {
        int n=s.length();
         dp=new Boolean [n][n+1];
        return helper(s,0,0);
    }
    public boolean helper(String s,int idx,int balance){
        if (balance < 0) {
            return false;
        }
        if(idx==s.length()){
            return balance==0;
        }
        if (dp[idx][balance] != null) {
            return dp[idx][balance];
        }
        char ch=s.charAt(idx);
        boolean ans;
        if(ch=='('){
            ans= helper(s,idx+1,balance+1);
        }
        else if(ch==')'){
            ans= helper(s,idx+1,balance-1);
        }
        else{
        boolean open=helper(s,idx+1,balance+1);
        boolean close=false;
       
            close=helper(s,idx+1,balance-1);
       
        boolean empty=helper(s,idx+1,balance);
        ans= open||close||empty;
        }

        
        dp[idx][balance]=ans;
        return ans;
    }
}