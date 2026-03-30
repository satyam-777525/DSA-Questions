class Solution {
    public int minOperations(int[] nums, int x) {
        int total=0;
        for(int z:nums){
            total+=z;
        }
        int y=total-x;
        if(y<0) return -1;
        if(y==0) return nums.length;

        int left=0;
        int maxlen=-1;
        int sum=0;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            while(sum>y){
                sum-=nums[left];
                left++;
            }
            if(sum==y) maxlen=Math.max(maxlen,right-left+1);

        }
        return maxlen==-1?-1:nums.length-maxlen;
    }
}