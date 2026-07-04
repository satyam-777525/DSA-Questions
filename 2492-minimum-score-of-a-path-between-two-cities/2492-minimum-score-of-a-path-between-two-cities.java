class Solution {
    public int minScore(int n, int[][] roads) {
        ArrayList<ArrayList<int[]>> map=new ArrayList<>();
        for(int i=0;i<=n;i++){
           map.add(new ArrayList<>());
        }
        for(int r[]:roads){
            int u=r[0];
            int v=r[1];
            int d=r[2];
            map.get(u).add(new int[]{v,d});
            map.get(v).add(new int[]{u,d});
        }
       Queue<Integer> q=new LinkedList<>();
       boolean visited[]=new boolean[n+1];
       q.add(1);
       visited[1]=true;
        int ans=Integer.MAX_VALUE;
       while(!q.isEmpty()){
        int node=q.poll();
       
        for(int neig[]:map.get(node)){
            int v=neig[0];
            int d=neig[1];
            ans=Math.min(ans,d);

            if(!visited[v]){
                q.add(v);
                visited[v]=true;
            }
        }
       }
       return ans;
        
    }
}