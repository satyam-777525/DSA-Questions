class Solution {
    int prefix[];
    int n;
    public int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {
        n=nums.length;
        prefix=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            prefix[i+1]=prefix[i]+nums[i];
        }
        int ans1=helper(firstLen,secondLen);
        int ans2=helper(secondLen,firstLen);
        return Math.max(ans1,ans2);
    }
    public int helper(int first,int sec){
        int ans=0;
        int maxfirst=0;

        for(int i=first;i<=n-sec;i++){
            maxfirst=Math.max(maxfirst,prefix[i]-prefix[i-first]);
            int maxsec=prefix[i+sec]-prefix[i];
            ans=Math.max(ans,maxfirst+maxsec);
        }
        return ans;
    }
}