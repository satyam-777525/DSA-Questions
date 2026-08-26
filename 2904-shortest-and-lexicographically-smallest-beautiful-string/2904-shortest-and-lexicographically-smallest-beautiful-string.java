class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int left=0;
        int one=0;
        String ans="";
        for(int right=0;right<s.length();right++){
            if(s.charAt(right)=='1'){
                one++;
            }
           while(one>k){
            if(s.charAt(left)=='1'){
                one--;
            }
            left++;
           }
           if(one==k){
            while(s.charAt(left)!='1'){
                left++;
            }
            String t=s.substring(left,right+1);
            if(ans==""||t.length()<ans.length()||(t.length()==ans.length()&&t.compareTo(ans)<0)){
                ans=t;
            }

           }

        }
        return ans;
    }
}