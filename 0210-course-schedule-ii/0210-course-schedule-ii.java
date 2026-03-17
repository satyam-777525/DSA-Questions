class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<Integer> list=new ArrayList<>();
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int edge[]:prerequisites){
            adj.get(edge[1]).add(edge[0]);
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
        if(list.size() != numCourses){
            return new int[0];
        }
        int arr[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
        
    }
}
