class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        boolean visited[]=new boolean[n];
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        

        while(!q.isEmpty()){
            int x=q.poll();
            visited[x]=true;
            for(int y:rooms.get(x)){
                if(!visited[y]){
                    q.add(y);
                }
            }
        }
        for(boolean s:visited){
            if(s==false){
                return false;
            }
        }
        return true;
    }
}