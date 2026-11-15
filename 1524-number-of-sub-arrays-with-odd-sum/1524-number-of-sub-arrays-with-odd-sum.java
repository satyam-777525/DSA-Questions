class Solution {
    public int numOfSubarrays(int[] arr) {
        int mod=1000000007;
        int evenc=1;
        int oddc=0;
        int prefix=0;
        int ans=0;
        for(int x:arr){
            prefix+=x;
            if(prefix%2==0){
                ans+=oddc;
                evenc++;
            }
            else{
                ans+=evenc;
                oddc++;
            }
            ans=ans%mod;
        }
        return ans;
    }
}