class Solution {
    public long maxProduct(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        long ans=(long)nums[n-1]*(long)nums[n-2]*100000L;
        ans=Math.max(ans,(long)nums[0]*(long)nums[1]*100000L);
        ans=Math.max(ans,(long)nums[0]*(long)nums[n-1]*-100000L);

        return ans;
    }
}