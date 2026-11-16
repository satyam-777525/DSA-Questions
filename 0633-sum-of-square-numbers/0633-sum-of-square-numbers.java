class Solution {
    public boolean judgeSquareSum(int c) {
        int n=(int)Math.sqrt(c);
        if(n*n==c) return true;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=i+1;
        }
        int i=0;
        int j=n-1;
        while(i<=j){
            long x=(long)arr[i]*arr[i]+(long)arr[j]*arr[j];
            if(x==c){
                return true;
            }
            if(x>c){
                j--;
            }else{
                i++;
            }
        }
        return false;
    }
}