class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n=nums.length;
        int ans=helper(0,nums.length-1,nums);
        return ans>=0;
        
    }
    public int helper(int i,int j,int[]nums){
        if(i==j){
            return nums[i];
        }
        int leftpick=nums[i]-helper(i+1,j,nums);
        int rightpick=nums[j]-helper(i,j-1,nums);

        return Math.max(leftpick,rightpick);
    }
}