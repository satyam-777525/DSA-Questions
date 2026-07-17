class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> ans=new ArrayList<>();
        int i=0;
        int n=words.length;
        while(i<n){
            int j=i;
            int letter=0;
            while(j<n && letter+words[j].length()+(j-i)<=maxWidth){
                letter+=words[j].length();
                j++;
            }
            int gap=j-i-1;
            StringBuilder sb=new StringBuilder();
            if(j==n||gap==0){
                for(int k=i;k<j;k++){
                    sb.append(words[k]);
                    if(k!=j-1){
                        sb.append(" ");
                    }
                }
                while(sb.length()<maxWidth){
                    sb.append(" ");
                }
            }else{
                int space=maxWidth-letter;
                int evenspace=space/gap;
                int extraspace=space%gap;
                for(int k=i;k<j;k++){
                    sb.append(words[k]);
                    if(k!=j-1){
                        for(int s=0;s<evenspace;s++){
                            sb.append(" ");
                        }
                        if(extraspace>0){
                            sb.append(" ");
                            extraspace--;
                        }
                    }
                }
            }
            ans.add(sb.toString());
            i=j;
        }
        return ans;
    }
}