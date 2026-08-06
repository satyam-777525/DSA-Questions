class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n;i<n+10;i++){
            int prod=1;
            int digit=i;
            while(digit>0){
                prod=prod*(digit%10);
                digit=digit/10;
            }
            if(prod%t==0){
                return i;
            }
        }
        return 0;
    }
}