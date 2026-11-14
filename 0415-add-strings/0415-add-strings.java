class Solution {
    public String addStrings(String num1, String num2) {
        int i=num1.length()-1;
        int j=num2.length()-1;
        int carry=0;
        String ans="";
        while(i>=0||j>=0||carry!=0){
            int x=0;
            if(i>=0){
                 x=num1.charAt(i)-'0';
                i--;
            }
            int y=0;
            if(j>=0){
                 y=num2.charAt(j)-'0';
                j--;
            }
            int sum=x+y+carry;
            ans=sum%10+ans;
            carry=sum/10;
        }
        return ans;
    }
}