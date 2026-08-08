class Solution {
    public int[] validSequence(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();

        int []suf=new int[n+1];
        int j=m-1;

        for(int i=n-1;i>=0;i--){
            if(j>=0 && word1.charAt(i)==word2.charAt(j)){
                j--;
            }
            suf[i]=m-1-j;
        }
        int ans[]=new int[m];
        int p=0;
        boolean used=false;
        for(int i=0;i<n&&p<m;i++){
            if(word1.charAt(i)==word2.charAt(p)){
                ans[p]=i;
                p++;
            }
            else if(!used){
                int remain=m-p-1;
                if(suf[i+1]>=remain){
                    ans[p]=i;
                    p++;
                    used=true;
                }
            }
        }
        if(p!=m){
            return new int[0];
        }
        return ans;
    }
}