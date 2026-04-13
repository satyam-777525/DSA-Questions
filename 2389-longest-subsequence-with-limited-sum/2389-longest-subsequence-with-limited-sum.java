class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int n=queries.length;
        int ans[]=new int[n];
        Arrays.sort(nums);
        for(int j=0;j<n;j++){
            int sum=0;
            int count=0;
            for(int i=0;i<nums.length;i++){
                sum+=nums[i];
                if(sum>queries[j]){
                    break;
                }
               count++;
            }
            ans[j]=count;
        }
        return ans;
        
    }
}