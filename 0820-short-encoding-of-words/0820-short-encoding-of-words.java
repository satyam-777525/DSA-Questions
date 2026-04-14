class Solution {
    public int minimumLengthEncoding(String[] words) {
        Arrays.sort(words,(a,b)->b.length()-a.length());
        String ans="";
        for(String word:words){
            if(!ans.contains(word+"#")){
                ans+=word+"#";
            }
        }
        return ans.length();
    }
}