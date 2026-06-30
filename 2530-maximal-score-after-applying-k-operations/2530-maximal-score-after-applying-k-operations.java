class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int x:nums){
            pq.add(x);
        }
        long ans=0;
        while(k-->0){
            int x=pq.poll();
            ans+=x;
            pq.add((int)Math.ceil(x/3.0));
        }
        return ans;
    }
}