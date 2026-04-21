class Solution {
    public int[] numberGame(int[] nums) {
        int ans[]=new int[nums.length];
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int x:nums){
            pq.add(x);
        }
        int i=0;
        while(!pq.isEmpty()){
            int alice=pq.poll();
            int bob=pq.poll();
            ans[i++]=bob;
            ans[i++]=alice;
        }
        return ans;
        
    }
}