class Solution {
    public String largestMerge(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        StringBuilder w1=new StringBuilder(word1);
        StringBuilder w2=new StringBuilder(word2);
        String ans="";
        
        while(w1.length()>0 && w2.length()>0){
            int x=w1.toString().compareTo(w2.toString());
            if(x>0){
                ans=ans+w1.charAt(0);
                w1.deleteCharAt(0);
            }
            else {
                ans=ans+w2.charAt(0);
                w2.deleteCharAt(0);
            }
        }
        ans=ans+w1.toString();
        ans=ans+w2.toString();
        return ans;
        
    }
}

