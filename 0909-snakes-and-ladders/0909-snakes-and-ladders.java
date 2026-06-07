class Solution {
    public int snakesAndLadders(int[][] board) {
        int n=board.length;
        Queue<Integer> q=new LinkedList<>();
        boolean[] visited=new boolean[n*n+1];
        q.add(1);
        visited[1]=true;
        int moves=0;

        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                int curr=q.poll();
                if(curr==n*n){
                    return moves;
                }
                for(int dice=1;dice<=6;dice++){
                    int next=curr+dice;
                    if(next>n*n) break;

                    int pos[]=position(next,n);
                    int row=pos[0];
                    int col=pos[1];

                    if(board[row][col]!=-1){
                        next=board[row][col];
                    }
                    if(!visited[next]){
                        visited[next]=true;
                        q.add(next);
                    }
                }
            }
            moves++;

        }
        return -1;
        
    }
    public static int[] position(int next,int n){
        int row=n-1-(next-1)/n;
        int col=(next-1)%n;
        int rowFromBottom = n-1-row;
        if(rowFromBottom%2==1) {
            col =n-1-col;
        }

        return new int[] { row, col };
    }
}