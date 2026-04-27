class Solution {
    public int longestSubarray(int[] nums) {
        int count=0;
        int maxlen=0;
        int left=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==0){
                count++;
            }
            if(count>1){
                while(count!=1){
                    if(nums[left]==0){
                        count--;
                    }
                    left++;
                }
            }
            
            maxlen=Math.max(maxlen,right-left);
        }
        return maxlen;
    }
}