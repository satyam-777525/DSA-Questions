class Solution {
    public List<Boolean> checkIfPrerequisite(int n, int[][] prerequisites, int[][] queries) {
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int q[]:prerequisites){
            graph.get(q[0]).add(q[1]);
        }
        boolean reach[][]=new boolean[n][n];

        for(int i=0;i<n;i++){
            Queue<Integer> q=new LinkedList<>();
            boolean vis[]=new boolean[n];
            q.add(i);
            vis[i]=true;
            while(!q.isEmpty()){
                int curr=q.poll();
                for(int neigh:graph.get(curr)){
                    if(!vis[neigh]){
                        vis[neigh]=true;
                        q.add(neigh);
                        reach[i][neigh]=true;
                    }
                }
            }
        }
        List<Boolean> ans=new ArrayList<>();
        for(int q[]:queries){
            ans.add(reach[q[0]][q[1]]);
        }
        return ans;
    }
}