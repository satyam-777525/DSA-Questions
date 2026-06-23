class Solution {
    public String reversePrefix(String word, char ch) {
        if(!word.contains(""+ch)){
            return word;
        }
        String ans="";
        int idx=0;
        for(int i=0;i<word.length();i++){
            ans=word.charAt(i)+ans;
            if(word.charAt(i)==ch){
                idx=i+1;
                break;
            }
        }
        ans+=word.substring(idx,word.length());
        return ans;
    }
}