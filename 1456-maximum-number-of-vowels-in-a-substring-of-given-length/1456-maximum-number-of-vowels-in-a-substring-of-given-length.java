class Solution {
    public int maxVowels(String s, int k) {
        int max=0;
        int left=0;
        int count=0;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            if("aeiou".contains(""+ch)){
                count++;
            }
            if(right-left+1>k){
                char l=s.charAt(left);
                if("aeiou".contains(""+l)){
                count--;
                }
                left++;
            }
            if(right-left+1==k){
                max=Math.max(max,count);
            }
        }
        return max;
    }
}