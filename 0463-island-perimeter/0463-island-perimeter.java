class Solution {
    int perimeter;
    int rows;
    int cols;
    public void dfs(int grid[][],int i,int j,boolean[][]visited){
        if(i<0 ||j<0 ||i>=rows||j>=cols ||grid[i][j]!=1){
            perimeter++;
            return ;
        }
        if(visited[i][j]){
            return ;
        }
        visited[i][j]=true;
        int adj[][]={{1,0},{0,1},{-1,0},{0,-1}};
        for(int arr[]:adj){
            dfs(grid,i+arr[0],j+arr[1],visited);
        }
    }
    public int islandPerimeter(int[][] grid) {
        rows= grid.length;
        cols=grid[0].length;
        boolean[][] visited=new boolean [rows][cols];
        perimeter=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==1){
                    dfs(grid,i,j,visited);
                }
            }
        }
        return perimeter;
        
    }
}