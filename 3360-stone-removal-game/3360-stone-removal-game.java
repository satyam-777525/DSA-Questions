class Solution {
    public boolean canAliceWin(int n) {
        int remove=10;
        if(n==10) return true;
        if(n<10){
            return false;
        }
        boolean player=true;
        while(n>=remove){
            if(player){
                player=false;
                n=n-remove;
                remove=remove-1;
            }else{
                player=true;
                n=n-remove;
                remove=remove-1;
            }
        }
        if(player) return false;
        return true;

        
    }
}