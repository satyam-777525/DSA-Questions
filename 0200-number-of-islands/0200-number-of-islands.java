class Solution {
    public int numIslands(char[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int island=0;

        boolean[][] visit=new boolean[row][col];
        int adjList[][]={{1,0},{-1,0},{0,1},{0,-1}};

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]=='1'&&visit[i][j]==false){
                    island++;
             
        // bfs
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{i,j});
        visit[i][j]=true;

        while(!q.isEmpty()){
            int x[]=q.poll();
            int r=x[0];
            int c=x[1];

            for(int d[]:adjList){
                int nr=r+d[0];
                int nc=c+d[1];

                if (nr>=0 && nr<row && nc >= 0 && nc < col && grid[nr][nc] == '1' && !visit[nr][nc]) {
                                q.add(new int[]{nr, nc});
                                visit[nr][nc] = true;
                }
            }
        }
                }}}
        
        return island;



    }
}