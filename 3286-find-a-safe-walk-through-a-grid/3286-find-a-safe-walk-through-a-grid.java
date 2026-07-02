class Solution {
    int dir[][]={{0,1},{1,0},{-1,0},{0,-1}};
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        int n=grid.size();
        int m=grid.get(0).size();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=grid.get(i).get(j);
            }
        }
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        pq.add(new int[]{arr[0][0],0,0});
        arr[0][0]=Integer.MAX_VALUE;

        while(!pq.isEmpty()){
            int curr[]=pq.poll();
            int cost=curr[0];
            int x=curr[1];
            int y=curr[2];
            if(x==n-1 &&y==m-1){
                return true;
            }
            for(int d[]:dir){
                int z=x+d[0];
                int w=y+d[1];
                if(z<0||z>=n||w<0||w>=m||health-arr[z][w]<=0){
                    continue;
                }
                int next=cost+arr[z][w];
                if(next<health){
                    pq.add(new int[]{next,z,w});
                    arr[z][w]=Integer.MAX_VALUE;
                }
            }
        }
        return false;
    }
}