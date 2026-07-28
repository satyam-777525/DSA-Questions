class Solution {
    public int minDistance(String str1, String str2) {
        int n=str1.length();
        int m=str2.length();
        int dp[][]=new int[n][m];
        for(int x[]:dp){
            Arrays.fill(x,-1);
        }
        int ans=helper(n-1,m-1,str1,str2,dp);
        return ans;
    }
    public static int helper(int idx1,int idx2,String s,String t,int dp[][]){
        if(idx1<0) return idx2+1;
        if(idx2<0) return idx1+1;
        if(dp[idx1][idx2]!=-1) return dp[idx1][idx2];
        if(s.charAt(idx1)==t.charAt(idx2)){
            return dp[idx1][idx2]= helper(idx1-1,idx2-1,s,t,dp);
        }
        int insert=1+helper(idx1,idx2-1,s,t,dp);
        int delete=1+helper(idx1-1,idx2,s,t,dp);
        int replace=1+helper(idx1-1,idx2-1,s,t,dp);
        return dp[idx1][idx2]=Math.min(insert,Math.min(delete,replace));
    }
}










// tabulization
// class Solution {
//     public int minDistance(String word1, String word2) {
//         int n=word1.length();
//         int m=word2.length();
//         int dp[][]=new int[word1.length()+1][word2.length()+1];

//         for(int i=0;i<=n;i++){
//             dp[i][0]=i;
//         }
//         for(int i=0;i<=m;i++){
//             dp[0][i]=i;
//         }
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=m;j++){
//                 if(word1.charAt(i-1)==word2.charAt(j-1)){
//                     dp[i][j]=dp[i-1][j-1];
//                 }
//                 else{
//                     dp[i][j]=1+Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]));
//                 }
//             }
//         }
//         return dp[n][m];

        
//     }
// }