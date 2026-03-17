class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<Integer> list=new ArrayList<>();
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int edge[]:prerequisites){
            adj.get(edge[0]).add(edge[1]);
        }

        int indegree[]=new int[numCourses];
        for(List<Integer> a:adj){
            for(int x:a){
                indegree[x]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }

        while(!q.isEmpty()){
            int x=q.poll();
            list.add(x);

            for(int neigh:adj.get(x)){
                indegree[neigh]--;
                if(indegree[neigh]==0){
                    q.add(neigh);
                }
            }
        }
        if(list.size()==numCourses)return true;

        return false;
        
    }
}