class Solution {
    public int[][] colorBorder(int[][] grid, int row, int col, int color) {
        int n=grid.length;
        int m=grid[0].length;
        int dir[][]={{1,0},{0,1},{-1,0},{0,-1}};

        boolean visited[][]=new boolean[n][m];
        boolean border[][]=new boolean[n][m];
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{row,col});
        visited[row][col]=true;

        while(!q.isEmpty()){
            int curr[]=q.poll();
            int x=curr[0];
            int y=curr[1];
            if(x==0||x==n-1||y==0||y==m-1){
                border[x][y]=true;
            }
            for(int []d:dir){
                if(x+d[0]>=0 && x+d[0]<n && y+d[1]>=0 && y+d[1]<m &&grid[x][y]!=grid[x+d[0]][y+d[1]]){
                    border[x][y]=true;
                    break;
                }
            }
            for(int d[]:dir){
                int nx=x+d[0];
                int ny=y+d[1];
                if(nx>=0 && nx<n && ny>=0 && ny<m && !visited[nx][ny]&& grid[x][y]==grid[nx][ny]){
                    q.add(new int[]{nx,ny});
                    visited[nx][ny]=true;
                }
            }

        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(border[i][j]){
                    grid[i][j]=color;
                }
            }
        }
        return grid;
    }
}