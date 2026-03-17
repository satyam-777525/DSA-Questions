class Solution {
    long sum;
    int rows;
    int cols;
    public void dfs(int[][] grid,int i ,int j,boolean[][] visited){
        if(i<0||j<0||i>=rows||j>=cols||visited[i][j]||grid[i][j]==0){
            return ;
        }
        sum+=grid[i][j];
        visited[i][j]=true;
        int adj[][]={{1,0},{0,1},{-1,0},{0,-1}};
        for(int arr[]:adj){
            dfs(grid,i+arr[0],j+arr[1],visited);
        }
        
    }
    public int countIslands(int[][] grid, int k) {
        rows=grid.length;
        cols=grid[0].length;
        sum=0;
        long count=0;
        boolean visited[][]=new boolean[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]!=0 && !visited[i][j]){
                    dfs(grid,i,j,visited);
                    if(sum%k==0) count++;
                    sum=0;
                }
            }
        }
        return (int)count;
        
    }
}