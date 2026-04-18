class Solution {
    public int countElements(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int x:nums){
            min=Math.min(x,min);
            max=Math.max(max,x);
        }
        int count=0;
        for(int x:nums){
            if(min<x && x<max){
                count++;
            }
        }
        return count;
    }
}