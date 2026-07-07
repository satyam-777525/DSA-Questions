class Solution {
    public long sumAndMultiply(int n) {
        String s=""+n;
        long a=0;
        long sum=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='0'){
                int digit=s.charAt(i)-'0';
                a=a*10+digit;
                sum=sum+digit;
            }
        }
        return a*sum;
        
        
    }
}