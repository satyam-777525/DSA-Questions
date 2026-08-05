class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int []i:invocations){
            int u=i[0];
            int v=i[1];
            adj.get(u).add(v);
        }
        boolean susp[]=new boolean[n];
        Queue<Integer> q=new LinkedList<>();
        q.add(k);
        susp[k]=true;

        while(!q.isEmpty()){
            int curr=q.poll();
            for(int neigh:adj.get(curr)){
                if(!susp[neigh]){
                    q.add(neigh);
                    susp[neigh]=true;
                }
            }
        }
        for(int x[]:invocations){
            int u=x[0];
            int v=x[1];
            if(!susp[u]&&susp[v]){
                List<Integer> ans=new ArrayList<>();
                for(int i=0;i<n;i++){
                  ans.add(i);
                }
                return ans;
            }
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(!susp[i]){
                ans.add(i);
            }
        }
        return ans;
    }
}