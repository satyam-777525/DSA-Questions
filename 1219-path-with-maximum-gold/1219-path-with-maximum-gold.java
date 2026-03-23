class Solution {
    int row;
    int col;
    public int getMaximumGold(int[][] grid) {
        row=grid.length;
        col=grid[0].length;
        int maxgold=0;
        boolean visited[][]=new boolean[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]!=0){
                    maxgold=Math.max(maxgold,dfs(i,j,grid,visited));
                }
            }
        }
        return maxgold;
    }
    public int dfs(int i,int j,int[][]grid,boolean[][]visited){
        if(i<0 ||j<0||i>=row ||j>=col||visited[i][j] ||grid[i][j]==0){
            return 0;
        }
        visited[i][j]=true;
        int maxgold=0;
        int arr[][]={{-1,0},{0,1},{1,0},{0,-1}};
        for(int adj[]:arr){
            maxgold=Math.max(maxgold,dfs(i+adj[0],j+adj[1],grid,visited));
        }
        visited[i][j]=false;
        return grid[i][j]+maxgold;
    }
}