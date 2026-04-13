class Solution {
    public int totalHammingDistance(int[] nums) {
        int count=0;
        for(int i=0;i<32;i++){
            int ones=0;
            for(int j=0;j<nums.length;j++){
                ones+=(nums[j]>>i)&1;     
            }
            int zero=nums.length-ones;
            count+=(ones*zero);
        }
        return count;
    }
}