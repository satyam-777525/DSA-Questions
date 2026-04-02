class Solution {
    public int primePalindrome(int n) {
        if(n<=2) return 2;
        if(n<=3) return 3;
        if(n<=5) return 5;
        if(n<=7) return 7;
        if(n<=11) return 11;
        
        for(int i=10;i<10000000;i++){
            String s=String.valueOf(i);
            String t=(new StringBuilder(s.substring(0,s.length()-1))).reverse().toString();
            int x=Integer.parseInt(s+t);
            if(x>=n && Prime(x)){
                return x;
            }
        }
        return 0;

    }
    public static boolean Prime(int n) {
    if (n <= 1) return false;
    if (n <= 3) return true; 
    if (n % 2 == 0 || n % 3 == 0) return false; 
    for (int i = 5; i * i <= n; i += 6) {
        if (n % i == 0 || n % (i + 2) == 0) return false;
    }
    return true;
}

}