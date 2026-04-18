class Solution {
    public int mirrorDistance(int n) {
        int x=reverse(n);
        return Math.abs(n-x);
        
    }
    public int reverse(int x){
        StringBuilder sb=new StringBuilder(""+x);
        sb.reverse();
        String s=sb.toString();
        int y=Integer.parseInt(s);
        return y;

    }
}