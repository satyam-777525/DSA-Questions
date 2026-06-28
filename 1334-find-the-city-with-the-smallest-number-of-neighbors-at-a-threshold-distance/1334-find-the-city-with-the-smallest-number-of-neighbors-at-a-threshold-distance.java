class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        ArrayList<ArrayList<int[]>> adj=new ArrayList<>();

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int []e:edges){
            int x=e[0];
            int y=e[1];
            int w=e[2];
            adj.get(x).add(new int[]{y,w});
            adj.get(y).add(new int[]{x,w});
        }
        int mincount=Integer.MAX_VALUE;
        int ans=-1;
        for(int src=0;src<n;src++){
            int dist[]=new int[n];
            Arrays.fill(dist,Integer.MAX_VALUE);

            dist[src]=0;
            PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[1]-b[1]);
            pq.add(new int[]{src,0});

            while(!pq.isEmpty()){
                int[] curr=pq.poll();
                int node=curr[0];
                int d=curr[1];
                for(int neigh[]:adj.get(node)){
                    int next=neigh[0];
                    int w=neigh[1];

                    if(d+w<dist[next]){
                        dist[next]=d+w;
                        pq.add(new int[]{next,dist[next]});
                    }
                }
            }
            int count=0;
            for(int i=0;i<n;i++){
                if(i!=src && dist[i]<=distanceThreshold){
                    count++;
                }
            }
            if(count<=mincount){
                mincount=count;
                ans=src;
            }
        }
        return ans;
    }
}