class Solution {
    public boolean checkValidGrid(int[][] grid) {
        if(grid[0][0]!=0){
            return false;
        }
        return helper(grid,0,0,0);
        
    }
    public static boolean helper(int[][]grid,int r,int c,int num){
        int n=grid.length;
        if(grid[r][c]==n*n-1){
            return true;
        }
        int i,j;
        // top right
        i=r-2;
        j=c+1;
        if((i>=0&&j<n) &&(grid[i][j]==num+1)) return helper(grid,i,j,num+1);
        // top left
        i=r-2;
        j=c-1;
        if((i>=0&&j>=0) &&(grid[i][j]==num+1)) return helper(grid,i,j,num+1);
        //down right
        i=r+2;
        j=c+1;
        if((i<n&&j<n) &&(grid[i][j]==num+1)) return helper(grid,i,j,num+1);
        // down left
        i=r+2;
        j=c-1;
        if((i<n&&j>=0) &&(grid[i][j]==num+1)) return helper(grid,i,j,num+1);
        //right up
        i=r-1;
        j=c+2;
        if((i>=0&&j<n) &&(grid[i][j]==num+1)) return helper(grid,i,j,num+1);
        // right down
        i=r+1;
        j=c+2;
        if((i<n&&j<n) &&(grid[i][j]==num+1)) return helper(grid,i,j,num+1);
        //left up
        i=r-1;
        j=c-2;
        if((i>=0&&j>=0) &&(grid[i][j]==num+1)) return helper(grid,i,j,num+1);
        // left down
        i=r+1;
        j=c-2;
        if((i<n&&j>=0) &&(grid[i][j]==num+1)) return helper(grid,i,j,num+1);

        return false;

    }
}