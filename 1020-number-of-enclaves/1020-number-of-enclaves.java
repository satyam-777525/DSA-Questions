class Solution {
    public int numEnclaves(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int dir[][]={{1,0},{0,1},{-1,0},{0,-1}};
        boolean visited[][]=new boolean[n][m];
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if((i==0 ||j==0||i==n-1||j==m-1) && grid[i][j]==1){
                    q.add(new int[]{i,j});
                    visited[i][j]=true;
                }
            }
        }
        while(!q.isEmpty()){
            int curr[]=q.poll();
            int x=curr[0];
            int y=curr[1];
            for(int []d:dir){
                int nx=x+d[0];
                int ny=y+d[1];
                if(nx<0||ny<0||nx>n-1||ny>m-1||visited[nx][ny]||grid[nx][ny]==0){
                    continue;
                }
                q.add(new int[]{nx,ny});
                visited[nx][ny]=true;
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1 && !visited[i][j]){
                    count++;
                }
            }
        }
        return count;
        
    }
}