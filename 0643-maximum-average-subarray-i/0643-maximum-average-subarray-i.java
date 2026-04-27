class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max=-Double.MAX_VALUE;
        int n=nums.length;
        double sum=0;
        int left=0;
        for(int right=0;right<n;right++){
            sum+=nums[right];
            if((right-left)+1>k){
                sum-=nums[left];
                left++;
            }
            if((right-left)+1==k){
                double avg=sum/k;
                max=Math.max(max,avg);
            }
        }
        return max;
    }
}