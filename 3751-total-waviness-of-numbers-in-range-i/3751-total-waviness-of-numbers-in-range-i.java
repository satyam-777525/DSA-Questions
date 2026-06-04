class Solution {
    public int totalWaviness(int num1, int num2) {
        int ans=0;
        for(int i=num1;i<=num2;i++){
            ans+=Waviness(i);
        }
        return ans;
        
    }
    public static int Waviness(int n){
        int count=0;
        String s=""+n;
        int i=1;
        int j=s.length()-2;
        while(i<=j){
            int digit1 = Character.getNumericValue(s.charAt(i));
            int digit0= Character.getNumericValue(s.charAt(i-1));
            int digit2= Character.getNumericValue(s.charAt(i+1));

            if(digit1>digit0 && digit1>digit2){
                count++;
            }
            else if(digit1<digit0 && digit1<digit2){
                count++;
            }
            i++;
        }
        return count;
        
    }
}