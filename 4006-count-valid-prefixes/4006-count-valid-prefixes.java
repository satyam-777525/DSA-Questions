class Solution {
    public int countValidPrefixes(String s) {
        int one=0;
        int zero=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') one++;
            else zero++;
            if((one==zero)||Math.abs(one-zero)==1){
                count++;
            }
        }
        return count;
    }
}