class Solution {
    public int reverseDegree(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            int x=s.charAt(i)-'a';
            x=26-x;
            ans+=x*(i+1);

        }
        return ans;
    }
}