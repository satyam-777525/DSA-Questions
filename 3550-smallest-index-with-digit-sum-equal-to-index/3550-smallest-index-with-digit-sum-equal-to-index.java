class Solution {
    public int smallestIndex(int[] nums) {
        int min=-1;
        for(int i=0;i<nums.length;i++){
            if(i==helper(nums[i])){
               return i;
            }
        }
        return -1;
    }
    public int helper(int x){
        int sum=0;
        while(x>0){
            sum=sum+x%10;
            x=x/10;
        }
        return sum;
    }
}