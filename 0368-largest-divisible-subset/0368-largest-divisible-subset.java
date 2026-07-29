class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int dp[]=new int[n];
        Arrays.fill(dp,1);
        int parent[]=new int[n];

        int maxlen=0;
        int lastidx=0;

        for(int idx=0;idx<n;idx++){
            parent[idx]=idx;
            for(int prev=0;prev<idx;prev++){
                if(nums[idx]%nums[prev]==0&&dp[prev]+1>dp[idx]){
                    dp[idx]=1+dp[prev];
                    parent[idx]=prev;
                }
            }
            if(dp[idx]>maxlen){
                maxlen=dp[idx];
                lastidx=idx;
            }
        }
        List<Integer> ans=new ArrayList<>();
        while(parent[lastidx]!=lastidx){
            ans.add(nums[lastidx]);
            lastidx=parent[lastidx];
        }
        ans.add(nums[lastidx]);
        return ans;
    }
}