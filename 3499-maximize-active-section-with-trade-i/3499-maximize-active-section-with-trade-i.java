class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int onecount=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                onecount++;
            }
        }
        int leftzero[]=new int[s.length()];
        if(s.charAt(0)=='0'){
            leftzero[0]=1;
        }else{
            leftzero[0]=0;
        }
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)=='0'){
                leftzero[i]=1+leftzero[i-1];
            }else{
                leftzero[i]=0;
            }
        }
        int rightzero[]=new int[s.length()];
        if(s.charAt(s.length()-1)=='0'){
            rightzero[s.length()-1]=1;
        }else{
            rightzero[s.length()-1]=0;
        }
        for(int i=s.length()-2;i>=0;i--){
            if(s.charAt(i)=='0'){
                rightzero[i]=1+rightzero[i+1];
            }else{
                rightzero[i]=0;
            }
        }
        int maxgain=0;
        int i=0;
        int n=s.length();
        while(i<n){
            if(s.charAt(i)=='1'){
                int start=i;
                while(i<n && s.charAt(i)=='1'){
                    i++;
                }
                int end=i-1;
                 if (start > 0 && end < n - 1 &&
                    s.charAt(start - 1) == '0' &&
                    s.charAt(end + 1) == '0') {

                    int left = leftzero[start - 1];
                    int right = rightzero[end + 1];

                    maxgain = Math.max(maxgain, left + right);
                }
            }else{
                i++;
            }
        }
        return onecount+maxgain;
    }
}
