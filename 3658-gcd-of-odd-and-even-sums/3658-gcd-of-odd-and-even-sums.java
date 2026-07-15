class Solution {
    public int gcd(int a, int b) {
        while (b!=0) {
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public int gcdOfOddEvenSums(int n) {
        int sumodd=n*n;
        int sumeven=n*(n+1);
        return gcd(sumodd,sumeven);
        
        
    }
}