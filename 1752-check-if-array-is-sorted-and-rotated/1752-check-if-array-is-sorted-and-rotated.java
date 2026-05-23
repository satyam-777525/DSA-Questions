class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            boolean temp=false;
            for(int j=i;j<i+n-1;j++){
                if(nums[j%n]>nums[(j+1)%n]){
                    temp=true;
                }
            }
            if(temp==false) return true;
        }
        return false;
    }
}