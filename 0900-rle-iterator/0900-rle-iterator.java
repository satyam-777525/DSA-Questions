class RLEIterator {
    Queue<int[]> q=new LinkedList<>();
    public RLEIterator(int[] encoding) {
        for(int i=0;i<encoding.length;i+=2){
            q.add(new int[]{encoding[i],encoding[i+1]});
        }
    }
    public int next(int n) {
        int ans=-1;
        while(!q.isEmpty() && n>0){

            int curr[]=q.peek();
            int count=curr[0];
            int val=curr[1];
            if(count>=n){
                curr[0]-=n;
                ans=val;
                n=0;
            }else{
                n=n-count;
                ans=val;
                q.poll();
            }
        }
        if(n>0){
            return -1;
        }
        return ans;
    }
}
