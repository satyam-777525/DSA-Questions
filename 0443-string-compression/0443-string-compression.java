class Solution {
    public int compress(char[] chars) {
        int i=0;
        int idx=0;
        int n=chars.length;

        while(i<n){
            char ch=chars[i];
            int count=0;
            while(i<n&&chars[i]==ch){
                i++;
                count++;
            }
            chars[idx++]=ch;
            if(count>1){
                String s=""+count;
                for(char c:s.toCharArray()){
                    chars[idx++]=c;
                }
            }
        }
        return idx;
    }
}
