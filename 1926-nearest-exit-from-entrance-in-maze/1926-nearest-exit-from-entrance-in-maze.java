class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int n=maze.length;
        int m=maze[0].length;
        Queue<int[]> q=new LinkedList<>();

        q.add(new int[]{entrance[0],entrance[1],0});
        maze[entrance[0]][entrance[1]]='+';

        int dir[][]={{1,0},{-1,0},{0,1},{0,-1}};
        
        while(!q.isEmpty()){
            int []curr=q.poll();
            int x=curr[0];
            int y=curr[1];
            int dist=curr[2];
            for(int d[]:dir){
                int nx=d[0]+x;
                int ny=d[1]+y;
                if(nx>=0&&ny>=0&&nx<n&&ny<m&&maze[nx][ny]=='.'){
                    if(nx==0||ny==0||nx==n-1||ny==m-1){
                        return dist+1;
                    }
                    q.add(new int[]{nx,ny,dist+1});
                    maze[nx][ny]='+';
                }
            }
        }  
        return -1;      
    }
}