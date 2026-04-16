class Solution {
    public long maximumMedianSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        long ans=0;
        for(int i=n-2;i>=n/3;i=i-2){
            ans+=nums[i];
        }
        return ans;
        
    }
}