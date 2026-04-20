class Solution {
    public String maximumOddBinaryNumber(String s) {
        int one=0;
        for(char ch:s.toCharArray()){
            if(ch=='1') one++;
        }
        int n=s.length();
        int zero=Math.abs(n-one);
        StringBuilder sb=new StringBuilder();
        String ans="";
        for(int i=0;i<one-1;i++){
            ans=ans+'1';
        }
        for(int i=0;i<=zero-1;i++){
            ans+='0';
        }
        return ans+'1';
        
    }
}