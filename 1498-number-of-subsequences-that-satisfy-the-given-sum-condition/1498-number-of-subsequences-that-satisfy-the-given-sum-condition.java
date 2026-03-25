class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        int mod=1000000007;
        int two[]=new int[n];
        two[0]=1;
        for(int i=1;i<n;i++){
            two[i]=(two[i-1]*2)%mod;
        }
        int left=0;
        int right=n-1;
        int ans=0;
        
        while(left<=right){
            if(nums[left]+nums[right]<=target){
                ans=(ans+two[right-left])%mod;
                left++;
            }
            else{
                right--;
            }
        }
        return ans;
    }
}