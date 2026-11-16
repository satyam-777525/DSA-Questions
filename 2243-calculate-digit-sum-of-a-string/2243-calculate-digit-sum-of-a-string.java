class Solution {
    public String digitSum(String s, int k) {
        String t=s;
        while(t.length()>k){
            String temp="";
            for(int i=0;i<t.length();i=i+k){
                int min=Math.min(t.length(),i+k);
                String a=t.substring(i,min);
                int b=helper(a);
                temp+=b;
            }
            t=temp;
        }
        return t;
    }
    public int helper(String s){
        int sum=0;
        for(int i=0;i<s.length();i++){
            int x=s.charAt(i)-'0';
            sum+=x;
        }
        return sum;
    }
}