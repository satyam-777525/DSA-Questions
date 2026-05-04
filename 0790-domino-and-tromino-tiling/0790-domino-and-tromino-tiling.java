class Solution {
    public int numTilings(int n) {
        long mod=1000000007;
        if(n==1) return 1;
        if(n==2) return 2;
        long arr[]=new long[n+1];
        arr[0]=1;
        arr[1]=1;
        arr[2]=2;
        for(int i=3;i<=n;i++){
            arr[i]=(2*arr[i-1]+arr[i-3])%mod;
        }
        return (int)arr[n];
    }
}