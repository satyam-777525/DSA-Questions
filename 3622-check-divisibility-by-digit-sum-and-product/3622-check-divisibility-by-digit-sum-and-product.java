class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int prod=1;
        int x=n;
        while(x>0){
            int y=x%10;
            sum+=y;
            prod*=y;
            x=x/10;
        }
        if(n%(sum+prod)==0) return true;
    
        return false;
        
    }
}