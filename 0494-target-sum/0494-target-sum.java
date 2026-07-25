class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n=nums.length;
        int ans=helper(n-1,0,target,nums);
        return ans;
    }
    public static int helper(int idx,int currsum,int target,int nums[]){
        if(idx<0){
            if(currsum==target){
                return 1;
            }else{
                return 0;
            }
        }
        int plus=helper(idx-1,currsum+nums[idx],target,nums);
        int minus=helper(idx-1,currsum-nums[idx],target,nums);
        return plus+minus;
    }
}