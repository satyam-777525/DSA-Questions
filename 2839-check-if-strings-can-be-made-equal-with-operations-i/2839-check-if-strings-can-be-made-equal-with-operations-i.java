class Solution {
    public boolean canBeEqual(String s1, String s2) {
        StringBuilder sb=new StringBuilder(s2);
        int i=0;
        for(int k=0;k<4;k++){
            if(s1.charAt(k)!=sb.charAt(k)&&k+2<4){
                char ch=sb.charAt(k+2);
                if(s1.charAt(k)==ch){
                    char temp=sb.charAt(k);
                    sb.setCharAt(k,sb.charAt(k+2));
                    sb.setCharAt(k+2,temp);
                }
            }
        }
        String s=sb.toString();

        return s1.equals(s);
        
    }
}