class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int maxlen=0;
        for(int i=0;i<nums.length;i++){
            int max=0;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j-1]<nums[j]){
                    max=Math.max(max,j-i+1);
                }else{
                    break;
                }
            }
            maxlen=Math.max(maxlen,max);
        }
        for(int i=0;i<nums.length;i++){
            int max=0;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j-1]>nums[j]){
                    max=Math.max(max,j-i+1);
                }else{
                    break;
                }
            }
            maxlen=Math.max(maxlen,max);
        }
        if(maxlen==0) return 1;

        return maxlen;
        
    }
}