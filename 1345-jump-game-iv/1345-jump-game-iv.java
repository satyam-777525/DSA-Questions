class Solution {
    public int minJumps(int[] arr) {
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        int n=arr.length;
        if(n==1) return 0;
        
        for(int i=0;i<n;i++){
            int x=arr[i];
            if(!map.containsKey(x)){
                map.put(x,new ArrayList<>());
            }
            map.get(x).add(i);
        }

        boolean visited[]=new boolean[n];
        int count=0;
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        visited[0]=true;
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
            int z=q.poll();
            if(z==n-1){
                return count;
            }
            if(z-1>=0 && !visited[z-1]){
                visited[z-1]=true;
                q.add(z-1);
            }
            if(z+1<n && !visited[z+1]){
                visited[z+1]=true;
                q.add(z+1);
            }
            for(int x:map.get(arr[z])){
                if(!visited[x]){
                    visited[x] = true;
                     q.add(x);
                }
            }
            map.get(arr[z]).clear();
        }
        count++;
        }
        return -1;

    }
}