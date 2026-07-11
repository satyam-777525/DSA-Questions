class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int e[]:edges){
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }
        boolean[] vis=new boolean[n];
        int ans=0;
        for(int i=0;i<n;i++){
            if(vis[i]) continue;
            vis[i]=true;
            int node=0;
            int edge=0;

            Queue<Integer> q=new LinkedList<>();
            q.add(i);
            while(!q.isEmpty()){
                int curr=q.poll();
                node++;
                edge+=adj.get(curr).size();
                for(int v:adj.get(curr)){
                    if(!vis[v]){
                        q.add(v);
                        vis[v]=true;
                    }
                }

            }
            edge=edge/2;
            if(edge==node*(node-1)/2){
                ans++;
            }

        }
        return ans;
    }
}