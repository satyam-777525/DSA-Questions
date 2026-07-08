class Solution {
    public int maximumProduct(int[] nums, int k) {
        int mod=1000000007;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int x:nums){
            pq.add(x);
        }
        while(k-->0){
            int y=pq.poll();
            y++;
            pq.add(y);
        }
        long mul=1;
        while(!pq.isEmpty()){
            int x=pq.poll();
            mul=(mul*x)%mod;
        }
        return (int)mul%mod;
    }
}