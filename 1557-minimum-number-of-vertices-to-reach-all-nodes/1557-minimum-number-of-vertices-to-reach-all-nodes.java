class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        // simply indegree calculate kr lo 
        List<Integer> res=new ArrayList<>();
        int indegree[]=new int[n];
        for(List<Integer> a:edges){
            indegree[a.get(1)]++;
        }

        for(int i=0;i<indegree.length;i++){
            if(indegree[i]==0){
                res.add(i);
            }
        }
        return res;
    }
}