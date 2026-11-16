class Solution {
    int[][] dir = {
            {-1,-1},{-1,0},{-1,1},
            {0,-1}, {0,1},
            {1,-1},{1,0},{1,1}
    };
    public char[][] updateBoard(char[][] board, int[] click) {
        int r=click[0];
        int c=click[1];
        if(board[r][c]=='M'){
            board[r][c]='X';
            return board;
        }
        int n=board.length;
        int m=board[0].length;

        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{r,c});

        while(!q.isEmpty()){
            int curr[]=q.poll();
            int x=curr[0];
            int y=curr[1];

            if(board[x][y]!='E') continue;
            int mines=0;
            for(int d[]:dir){
                int nx=x+d[0];
                int ny=y+d[1];
                if(nx>=0 &&ny>=0&&nx<n &&ny<m){
                    if(board[nx][ny]=='M'){
                        mines++;
                    }
                }
            }
            if(mines>0){
                board[x][y]=(char)(mines+'0');
            }else{
                board[x][y]='B';

                for(int[] d:dir){
                    int nx=x+d[0];
                    int ny=y+d[1];
                    if(nx>=0 &&ny>=0&&nx<n &&ny<m&& board[nx][ny]=='E'){
                      q.add(new int[]{nx,ny});
                    }
                }
            }
        }
        return board;
    }
}