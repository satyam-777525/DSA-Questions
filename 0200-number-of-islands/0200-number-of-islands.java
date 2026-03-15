class Solution {
    int rows;
    int cols;
    public int numIslands(char[][] grid) {
        int islands=0;
        rows=grid.length;
        cols =grid[0].length;
        boolean visited[][]=new boolean[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]=='1' && visited[i][j]==false){
                    islands++;
                    dfs(grid,i,j,visited);
                }
            }
        }
        return islands;
        
    }
    public void dfs(char[][] grid,int r,int c,boolean[][]visited){
        if(r<0 ||c<0||r>=rows||c>=cols||grid[r][c]=='0'||visited[r][c]==true){
            return;
        }
        visited[r][c]=true;
        int adj[][]={{r-1,c},{r,c+1},{r+1,c},{r,c-1}};
        for(int[]neigh:adj){
            dfs(grid,neigh[0],neigh[1],visited);
        }
    }
}