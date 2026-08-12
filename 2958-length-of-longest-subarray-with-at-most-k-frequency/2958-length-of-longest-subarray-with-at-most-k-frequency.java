class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int currlength=0;
        int maxlength=0;
        int left=0;
        for(int right=0;right<nums.length;right++){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);

            while(map.get(nums[right])>k){
                map.put(nums[left],map.get(nums[left])-1);
                left++;
            }
            currlength=right-left+1;
            maxlength=Math.max(currlength,maxlength);
        }
        return maxlength;
        
    }
}