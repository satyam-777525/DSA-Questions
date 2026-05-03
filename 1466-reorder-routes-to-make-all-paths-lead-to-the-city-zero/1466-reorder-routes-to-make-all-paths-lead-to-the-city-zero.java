class Solution {
    int count;
    boolean visited[];
    public int minReorder(int n, int[][] connections) {
        count=0;
        visited=new boolean[n];
        List<List<int[]>> graph=new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int c[]:connections){
            graph.get(c[0]).add(new int[]{c[1],1});
            graph.get(c[1]).add(new int[]{c[0],0});
        }
         dfs(0,graph);
        return count;
        
    }
    public void dfs(int node,List<List<int[]>> graph){
        visited[node]=true;
        for(int c[]:graph.get(node)){
            int nei=c[0];
            int rev=c[1];
            if(!visited[nei]){
                count+=rev;
                dfs(nei,graph);
            }
        }
    }
}