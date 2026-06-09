class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int x:nums){
            max=Math.max(max,x);
            min=Math.min(min,x);
        }
        long value=max-min;
        value=value*k;
        return value;



        
    }
}