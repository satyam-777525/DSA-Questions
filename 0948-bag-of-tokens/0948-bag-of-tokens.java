class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int i=0;
        int j=tokens.length-1;
        int score=0;
        int maxscore=0;
        while(i<=j){
            if(power>=tokens[i]){
                score++;
                maxscore=Math.max(score,maxscore);
                power=power-tokens[i];
                i++;
            }
            else if(score>0){
                power+=tokens[j];
                j--;
                score--;
            }else{
                break;
            }
        }
        return maxscore;
    }
}