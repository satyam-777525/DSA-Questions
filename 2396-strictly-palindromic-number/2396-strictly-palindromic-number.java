class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for(int i=2;i<=n-2;i++){
            String s=Integer.toString(n,i);
            if(!check(s)){
                return false;
            }
        }
        return true;
        
    }
    public static boolean check(String s){
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        String p=sb.toString();
         return s.equals(p);
    }
}