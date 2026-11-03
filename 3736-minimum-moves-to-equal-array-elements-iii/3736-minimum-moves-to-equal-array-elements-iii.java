class Solution {
    public int minMoves(int[] nums) {
        int count=0;
        int max=Integer.MIN_VALUE;
        for(int x:nums){
            max=Math.max(max,x);
        }
        for(int x:nums){
            if(x<max){
                count=count+max-x;
            }
        }
        return count;
        
    }
}