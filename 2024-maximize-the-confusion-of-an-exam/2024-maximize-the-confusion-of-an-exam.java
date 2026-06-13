class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        return Math.max(sliding(answerKey,k,'T'),sliding(answerKey,k,'F'));
        
    }
    public int sliding(String answerKey,int k,char target){
        int maxlen=0;
        int count=0;
        int left=0;
        for(int right=0;right<answerKey.length();right++){
            if(answerKey.charAt(right)!=target){
                count++;
            }
            while(count>k){
                if(answerKey.charAt(left)!=target){
                    count--;
                }
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
}