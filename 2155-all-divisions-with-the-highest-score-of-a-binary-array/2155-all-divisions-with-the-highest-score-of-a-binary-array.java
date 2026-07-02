class Solution {
    public List<Integer> maxScoreIndices(int[] nums) {
        int n=nums.length;
        
        int zero[]=new int[n+1];
        for(int i=0;i<n;i++){
            zero[i + 1]=zero[i];
            if (nums[i]==0)
                zero[i + 1]++;
        }
        int one[]=new int[n+1];
        for(int i=n-1;i>=0;i--){
            one[i]=one[i+1];
            if (nums[i]==1)
                one[i]++;
        }
        int ans[]=new int[n+1];
        int max=-1;
        for(int i=0;i<=n;i++){
            ans[i]=one[i]+zero[i];
            max=Math.max(max,ans[i]);
        }
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<n+1;i++){
            if(ans[i]==max){
                res.add(i);
            }
        }
        return res;

    }
}
