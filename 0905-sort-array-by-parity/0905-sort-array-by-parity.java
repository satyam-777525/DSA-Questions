class Solution {
    public int[] sortArrayByParity(int[] nums) {
        if(nums.length==1) return nums;
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            if((nums[i]%2!=0&&nums[j]%2==0)){
                int x=nums[i];
                nums[i]=nums[j];
                nums[j]=x;
                i++;
                j--;
            }
            else if(nums[i]%2==0&&nums[j]%2==0){
                i++;
            }
            else if(nums[i]%2!=0&&nums[j]%2!=0){
                j--;
            }else{
                i++;
                j--;
            }
        }
        return nums;
    }
}