class KthLargest {
    PriorityQueue<Integer> pq;
    int l;
    public KthLargest(int k, int[] nums) {
        l=k;
        pq=new PriorityQueue<>();
        for(int x:nums){
            pq.add(x);
            if(pq.size()>k){
                pq.poll();
            }
        }
        
    }
    
    public int add(int val) {
        pq.add(val);
        if(pq.size()>l){
            pq.poll();
        }
        return pq.peek();
        
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */