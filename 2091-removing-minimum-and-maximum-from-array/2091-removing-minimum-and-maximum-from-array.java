class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int minidx=-1;
        int maxidx=-1;
        int max=Arrays.stream(nums).max().getAsInt();
        int min=Arrays.stream(nums).min().getAsInt();
        for(int i=0;i<n;i++){
            if(nums[i]==max){
                maxidx=i;
            }
            if(nums[i]==min){
                minidx=i;
            }
        }
        int ans=Integer.MAX_VALUE;
        if(minidx>maxidx){
            ans=Math.min(ans,minidx+1);
            ans=Math.min(ans,n-maxidx);
            int dist=n-minidx + maxidx+1;
            ans=Math.min(ans,dist);
        }else{
            ans=Math.min(ans,maxidx+1);
            ans=Math.min(ans,n-minidx);
            int dist=n-maxidx+minidx+1;
            ans=Math.min(ans,dist);
        }

        return ans;
    }
}