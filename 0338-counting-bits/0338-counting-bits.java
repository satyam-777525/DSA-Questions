class Solution {
    public int[] countBits(int n) {
        int ans[]=new int[n+1];
        for(int i=0;i<n+1;i++){
            ans[i]=fun(i);
        }
        return ans;
    }
    public int fun(int n){
        int count=0;
        while(n>0){
            if(n%2==1){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
}