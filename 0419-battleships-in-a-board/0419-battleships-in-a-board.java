class Solution {
    public int countBattleships(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        int count=0;
        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
        boolean [][] visited=new boolean[n][m];
        Queue<int[]> q=new LinkedList<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]=='X' && !visited[i][j]){
                    count++;
                    visited[i][j]=true;
                    q.add(new int[]{i,j});
                    while(!q.isEmpty()){
                        int curr[]=q.poll();
                        int r=curr[0];
                        int c=curr[1];
                        for(int d[]:dir){
                            int nx=d[0]+r;
                            int ny=d[1]+c;

                            if(nx>=0&&nx<n&&ny>=0&&ny<m &&board[nx][ny]=='X' && !visited[nx][ny]){
                                visited[nx][ny]=true;
                                q.add(new int[]{nx,ny});
                            }
                        }
                    }
                }
            }
        }
        return count;
    }
}