class Solution {
    public int minFlips(int a, int b, int c) {
        int count=0;
        for(int i=0;i<32;i++){
            int x=(a>>i)&1;
            int y=(b>>i)&1;
            int z=(c>>i)&1;

            if(z==1){
                if(x==0&& y==0){
                    count++;
                }
            }
            if(z==0){
                if((x==1&&y==0)||(x==0&&y==1)){
                    count++;
                }else if(x==1&&y==1){
                    count=count+2;
                }
            }

        }
        return count;
        
    }
}