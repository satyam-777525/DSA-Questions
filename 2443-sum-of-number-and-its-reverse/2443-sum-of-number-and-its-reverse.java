class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        if(num==0) return true;
        for(int i=0;i<num;i++){
            int x=i;
            int y=rev(x);
            if(x+y==num){
                return true;
            }
        }
        return false;
    }
    public int rev(int n){
        int sum=0;
        while(n>0){
            sum=sum*10+n%10;
            n=n/10;
        }
        return sum;
    }
}