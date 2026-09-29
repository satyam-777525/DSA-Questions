class Solution {
    int n;
    int m;
    Boolean dp[][][];
    public boolean hasValidPath(char[][] grid) {
        n=grid.length;
        m=grid[0].length;
        if((n+m-1)%2==1) return false;
        dp=new Boolean[n][m][n+m+1];

        return helper(grid,0,0,0);
    }
    public boolean helper(char grid[][],int i,int j,int balance){
        if(grid[i][j]=='('){
            balance++;
        }else{
            balance--;
        }
        if(balance<0) return false;
        if(i==n-1&& j==m-1){
            return balance==0;
        }

        if(dp[i][j][balance]!=null){
            return dp[i][j][balance];
        }
        
       
        boolean ans=false;
        if(i+1<n){
            ans=ans||helper(grid,i+1,j,balance);
        }
        if(j+1<m){
            ans=ans||helper(grid,i,j+1,balance);
        }

        return dp[i][j][balance]=ans;
    }
}