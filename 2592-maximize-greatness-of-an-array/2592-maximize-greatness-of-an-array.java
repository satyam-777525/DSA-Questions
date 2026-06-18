class Solution {
    public int maximizeGreatness(int[] nums) {
        int i=0;
        int j=0;
        int count=0;
        Arrays.sort(nums);
        while(j<nums.length){
            if(nums[i]<nums[j]){
                count++;
                i++;
            }
            j++;
        }
        return count;
    }
}
   

