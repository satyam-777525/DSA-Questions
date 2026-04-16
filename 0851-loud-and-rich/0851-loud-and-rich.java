class Solution {
    public int[] loudAndRich(int[][] richer, int[] quiet) {
        int n=quiet.length;
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int [] r:richer){
            int x=r[0];
            int y=r[1];
            graph.get(y).add(x);
        }
        int ans[]=new int[n];
        Arrays.fill(ans,-1);

        for(int i=0;i<n;i++){
           dfs(i,graph,quiet,ans);
        }
        return ans;
        
    }
    public int dfs(int idx,List<List<Integer>> graph,int[] quiet,int ans[]){
        if(ans[idx]!=-1) return ans[idx];
        ans[idx]=idx;
        for(int x:graph.get(idx)){
            int y=dfs(x,graph,quiet,ans);
            if(quiet[y]<quiet[ans[idx]]){
                ans[idx]=y;
            }
        }
        return ans[idx];
    }
}