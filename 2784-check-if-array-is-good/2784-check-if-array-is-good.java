class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        int max=Integer.MIN_VALUE;
        for(int x:nums){
            max=Math.max(x,max);
        }
        int[] temp=new int[max+1];
        int n=temp.length;
        temp[n-1]=max;
        temp[n-2]=max;
        for(int i=n-3;i>=0;i--){
            temp[i]=max-1;
            max--;
        }
        if(nums.length!=temp.length) return false;
        for(int i=0;i<temp.length;i++){
            if(nums[i]!=temp[i]){
                return false;
            }
        }
        return true;


    }
}