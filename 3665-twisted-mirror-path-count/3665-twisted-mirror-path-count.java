class Solution {
    int n;
    int m;
    int dp[][][];
    int mod=1000000007;
    public int uniquePaths(int[][] grid) {
        n=grid.length;
        m=grid[0].length;
        dp=new int[n][m][2];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                for(int d=0;d<2;d++){
                    dp[i][j][d]=-1;
                }
            }
        }
        int right=dfs(0,1,0,grid);
        int down=dfs(1,0,1,grid);

        return (right+down)%mod;
    }
    public int dfs(int i,int j,int d,int[][]grid){
        if(i>=n||j>=m) return 0;
        if(i==n-1&&j==m-1) return 1;

        if(dp[i][j][d]!=-1) return dp[i][j][d];

        long ans=0;
        if(grid[i][j]==1){
            if(d==0){
                ans=dfs(i+1,j,1,grid);
            }
            else{
                ans=dfs(i,j+1,0,grid);
            }
        }
        else{
            ans=dfs(i,j+1,0,grid)+dfs(i+1,j,1,grid);
        }
        return dp[i][j][d]=(int)(ans%mod);
    }
}