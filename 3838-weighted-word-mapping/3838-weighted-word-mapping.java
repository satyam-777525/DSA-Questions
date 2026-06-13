class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String ans="";
        for(int i=0;i<words.length;i++){
            int sum=0;
            for(char ch:words[i].toCharArray()){
                sum+=weights[ch-'a'];
            }
            int res=sum%26;
            char s=(char)('z'-res);
            ans+=s;
        }
        return ans;
        
    }
}