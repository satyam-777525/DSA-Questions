class Solution {
    int n;
    int m;
    boolean visited[][];
    int[][] dir = {{-1,0}, {1,0},{0,-1},{0,1}};
    int opp[]={1,0,3,2};
    int[][] street={
        {},
        {2, 3},
        {0, 1},
        {2, 1},
        {3, 1},
        {2, 0},
        {3, 0}
    };

    public boolean hasValidPath(int[][] grid) {
         n=grid.length;
         m=grid[0].length;
        visited=new boolean[n][m];
        return dfs(grid,0,0);     
    }
    public boolean dfs(int[][]grid,int i,int j){
        if(i==n-1 && j==m-1) return true;
        visited[i][j]=true;
        int curr=grid[i][j];

        for(int d:street[curr]){
            int x=i+dir[d][0];
            int y=j+dir[d][1];
            if(x<0||y<0||x>=n||y>=m||visited[x][y]) continue;

            int temp=grid[x][y];
            for(int z:street[temp]){
                if(z==opp[d]){
                    if(dfs(grid,x,y)) return true;
                }
            }

        }
        return false;

    }
}