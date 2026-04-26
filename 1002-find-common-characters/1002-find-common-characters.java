class Solution {
    public List<String> commonChars(String[] words) {
        int ch[]=new int[26];
        Arrays.fill(ch,Integer.MAX_VALUE);
        for(String w:words){
            int c[]=new int[26];
            for(char s:w.toCharArray()){
                c[s-'a']++;
            }
            for(int i=0;i<26;i++){
                ch[i]=Math.min(ch[i],c[i]);
            }

        }
        List<String> ans=new ArrayList<>();
        for(int i=0;i<26;i++){
            while(ch[i]>0){
                ans.add(""+(char)(i+'a'));
                ch[i]--;
            }
        }
        return ans;
    }
}



