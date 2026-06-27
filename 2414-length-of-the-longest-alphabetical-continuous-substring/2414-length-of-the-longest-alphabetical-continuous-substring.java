class Solution {
    public int longestContinuousSubstring(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            int count=1;
            int k=i;
            int j=i+1;
            while(j<s.length()&&s.charAt(j)-s.charAt(i)==1){
                j++;
                i++;
                count++;
            }
            ans=Math.max(ans,count);
        }
        return ans;
    }
}