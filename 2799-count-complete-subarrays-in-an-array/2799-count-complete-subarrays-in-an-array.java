class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int n=nums.length;
        HashSet<Integer> set=new HashSet<>();
        for(int x:nums){
            set.add(x);
        }
        int len=set.size();
        int count=0;
        for(int i=0;i<=n-len;i++){
            HashSet<Integer> set2=new HashSet<>();
            for(int j=i;j<n;j++){
                set2.add(nums[j]);
                if(set.equals(set2)){
                    count++;
                }
            }
        }
        return count;
    }
}