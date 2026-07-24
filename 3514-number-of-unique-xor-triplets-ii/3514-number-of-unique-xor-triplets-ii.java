class Solution {
    public int uniqueXorTriplets(int[] nums) {
        boolean pair[]=new boolean[2048];
        boolean triple[]=new boolean[2048];
        int n=nums.length;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                pair[nums[i]^nums[j]]=true;
            }
        }
        for(int i=0;i<2048;i++){
            if(!pair[i]) continue;
            for(int x:nums){
                triple[x^i]=true;
            }
        }
        int count=0;
        for(boolean curr:triple){
            if(curr){
                count++;
            }
        }
        return count;
    }
}