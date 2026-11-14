class Solution {
    public String stringHash(String s, int k) {
        String ans="";
        for(int i=0;i<s.length();i=i+k){
            String t=s.substring(i,i+k);
            int x=0;
            for(char ch:t.toCharArray()){
                x+=ch-'a';
            }
            x=x%26;
            ans+=(char)('a'+x);
        }
        return ans;
    }
}