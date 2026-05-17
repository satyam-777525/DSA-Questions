class Solution {
    public boolean canReach(int[] arr, int start) {
        if(arr[start]==0) return true;
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            int x=i+arr[i];
            int y=i-arr[i];
            if(x<n){
                graph.get(i).add(x);
            }
            if(y>=0){
                graph.get(i).add(y);
            }
        }
        boolean []visited=new boolean[n];   
        Queue<Integer> q=new LinkedList<>();
        q.add(start);
        while(!q.isEmpty()){
            int z=q.poll();
            visited[z]=true;
            for(int neig:graph.get(z)){
                if(arr[neig]==0){
                    return true;
                }
                if(!visited[neig]){
                    visited[neig]=true;
                    q.add(neig);
                }
            }
            
        }
return false;
    }
}