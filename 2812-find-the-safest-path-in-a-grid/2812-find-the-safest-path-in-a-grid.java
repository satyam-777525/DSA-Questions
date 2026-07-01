class Solution {
    public int maximumSafenessFactor(List<List<Integer>> grid) {
        int n=grid.size();
        int dist[][]=new int[n][n];
        for(int[]r:dist){
            Arrays.fill(r,-1);
        }
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid.get(i).get(j)==1){
                     q.add(new int[]{i,j});
                     dist[i][j]=0;
                }
               
            }
        }
       
       int dir[][]={{-1,0},{0,1},{1,0},{0,-1}};
       while(!q.isEmpty()){
        int[]curr=q.poll();
        int x=curr[0];
        int y=curr[1];
        for(int d[]:dir){
            int z=x+d[0];
            int w=y+d[1];
            if(z>=0&&w>=0&& z<n && w<n && dist[z][w]==-1){
                q.add(new int[]{z,w});
                dist[z][w]=dist[x][y]+1;
                
            }
        }
       }
       PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->b[0]-a[0]);
       boolean visited[][]=new boolean[n][n];
       pq.add(new int[]{dist[0][0],0,0});
       visited[0][0]=true;

       while(!pq.isEmpty()){
        int curr[]=pq.poll();
        int safe=curr[0];
        int x=curr[1];
        int y=curr[2];
        if(x==n-1 && y==n-1){
            return safe;
        }
        for(int d[]:dir){
            int z=x+d[0];
            int w=y+d[1];
            if(z>=0&&w>=0&&  z<n && w<n && !visited[z][w]){
                visited[z][w]=true;
                int h=Math.min(safe,dist[z][w]);
                pq.add(new int[]{h,z,w});
            }
        }
       }
       return 0;

        
    }
}