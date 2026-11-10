class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int l1=s1.length();
        int l2=s2.length();
        int dp[][]=new int[l1+1][l2+1];

        for(int i=1;i<=l1;i++){
            for(int j=1;j<=l2;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=s1.charAt(i-1)+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        int total=0;
        for(char ch:s1.toCharArray()) total+=ch;
        for(char ch:s2.toCharArray()) total+=ch;

        return total-2*dp[l1][l2];
       
    }
}