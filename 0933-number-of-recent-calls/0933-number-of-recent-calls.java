class RecentCounter {
    ArrayList<Integer> res;
    public RecentCounter() {
        res=new ArrayList<>();
    }
    
    public int ping(int t) {
        res.add(t);
        int low=t-3000;
        int high=t;
        int count=0;
        for(int x:res){
            if(x>=low && x<=high){
                count++;
            }
        }
        return count;
    }
}

