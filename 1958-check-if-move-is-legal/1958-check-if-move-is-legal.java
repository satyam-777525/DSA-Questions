class Solution {
    public boolean checkMove(char[][] board, int rMove, int cMove, char color) {
        char oppo=(color=='W')?'B':'W';
        int[][] dir = {
            {-1,0},{1,0},{0,-1},{0,1},
            {-1,-1},{-1,1},{1,-1},{1,1}
        };
        for(int d[]:dir){
            int r=rMove+d[0];
            int c=cMove+d[1];
            int count=0;
            while(r>=0&&r<8&&c>=0&&c<8&&board[r][c]==oppo){
                count++;
                r=r+d[0];
                c=c+d[1];
            }
            if(count==0) continue;
            if(r>=0&&r<8&&c>=0&&c<8&&board[r][c]==color){
                return true;
            }

        }
        return false;
    }
}