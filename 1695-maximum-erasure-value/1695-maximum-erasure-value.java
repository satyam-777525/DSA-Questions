class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int sum=0;
        int ans=0;
        int left=0;
        HashSet<Integer> set=new HashSet<>();
        for(int right=0;right<nums.length;right++){
            while(set.contains(nums[right])){
                sum-=nums[left];
                set.remove(nums[left]);
                left++;               
            }
            set.add(nums[right]);
            sum+=nums[right];
            ans=Math.max(ans,sum);
        }
        return ans;
    }
}