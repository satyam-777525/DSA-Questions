class Solution {
    public int scoreOfString(String s) {
        int score=0;
        for(int i=0;i<s.length()-1;i++){
            int x=s.charAt(i);
            int y=s.charAt(i+1);
            score+=Math.abs(x-y);
        }
        return score;
    }
}