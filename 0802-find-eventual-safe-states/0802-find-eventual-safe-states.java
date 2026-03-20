class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n=graph.length;
        List<List<Integer>> adj=new ArrayList<>(); // rev adjaceny list
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        int indegree[]=new int[n];
        for(int i=0;i<n;i++){
            for(int g:graph[i]){
                indegree[i]++;
                adj.get(g).add(i);
            }
        }

        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<indegree.length;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        boolean safe[]=new boolean[n];
        while(!q.isEmpty()){
            int node=q.poll();
            safe[node]=true;
            for(int neigh:adj.get(node)){
                indegree[neigh]--;
                if(indegree[neigh]==0){
                    q.add(neigh);
                }
            }
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<safe.length;i++){
            if(safe[i]==true){
                ans.add(i);
            }
        }
        return ans;
    }
}


