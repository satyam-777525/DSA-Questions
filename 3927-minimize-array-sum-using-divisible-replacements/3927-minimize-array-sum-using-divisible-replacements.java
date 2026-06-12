class Solution {
    public long minArraySum(int[] nums) {
        int max=0;
        for(int x:nums){
            max=Math.max(max,x);
        }
        int freq[]=new int[max+1];
        for(int x:nums){
            freq[x]++;
        }
        long ans=0;
        for(int x=1;x<=max;x++){
            if(freq[x]==0) continue;
            for(int mul=x;mul<=max;mul+=x){
                if(freq[mul]>0){
                    ans+=1L*freq[mul]*x;
                    freq[mul]=0;
                }
            }
        }
        return ans;
    }
}


