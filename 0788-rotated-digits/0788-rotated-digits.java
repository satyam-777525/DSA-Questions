class Solution {
    public int rotatedDigits(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            if(good(i)){
                count++;
            }
        }
        return count;
    }
    public static boolean good(int x){
        boolean temp=false;
        while(x>0){
            int d=x%10;
            if(d==3||d==4||d==7){
                return false;
            }
            if(d==2||d==5||d==6||d==9){
                temp=true;
            }
            x=x/10;
        }
        return temp;
    }
}
