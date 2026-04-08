class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        long ans=0;
        int mod=1000000007;
        for(int q[]:queries){
            for(int i=q[0];i<=q[1];i=i+q[2]){
                long x=nums[i];
                nums[i]=(int)((1L*nums[i]*q[3])%mod);
            }
        }
        
        for(int x:nums){
            ans=(ans^x);
        }
        return (int) ans;
        
    }
}