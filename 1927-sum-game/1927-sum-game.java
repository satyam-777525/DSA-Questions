class Solution {
    public boolean sumGame(String num) {
        int n=num.length();
        int half=n/2;
        int leftsum=0;
        int rightsum=0;
        int left=0;
        int right=0;
        for(int i=0;i<half;i++){
            if(num.charAt(i)=='?'){
                left++;
            }else{
                leftsum+=num.charAt(i)-'0';
            }
        }
        for(int i=half;i<n;i++){
            if(num.charAt(i)=='?'){
                right++;
            }else{
                rightsum+=num.charAt(i)-'0';
            }
        }
        return (leftsum-rightsum)*2!=(right-left)*9;
    }
}
