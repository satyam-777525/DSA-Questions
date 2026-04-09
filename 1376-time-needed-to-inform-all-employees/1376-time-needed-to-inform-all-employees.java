class Solution {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<manager.length;i++){
            if(manager[i]!=-1){
                if(!map.containsKey(manager[i])){
                    map.put(manager[i],new ArrayList<>());
                }
                map.get(manager[i]).add(i);
            }
        }   
        int max=0;
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{headID,0});
        while(!q.isEmpty()){
            int arr[]=q.poll();
            int e=arr[0];
            int t=arr[1];
            max=Math.max(max,t);
            if(map.containsKey(e)){
                for(int x:map.get(e)){
                    q.add(new int[]{x,t+informTime[e]});
                }
            }
        }
        return max;
    }
}
