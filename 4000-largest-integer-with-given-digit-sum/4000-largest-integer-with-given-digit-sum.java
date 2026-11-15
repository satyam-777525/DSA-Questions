
class Solution {
    public int largestInteger(int n, int s) {
        if(s==0) return 0;
        if(n==1){
            for(int i=9;i>=1;i--){
                if(i==s){
                    return s;
                }
            }
        }
        if(n==2){
            for(int i=99;i>=10;i--){
                int x=check(i);
                if(x==s){
                    return i;
                }
            }
            return -1;
        }
        if(n==3){
            for(int i=999;i>=100;i--){
                int x=check(i);
                if(x==s){
                    return i;
                }
            }
            return -1;
        }
        if(n==4){
            for(int i=9999;i>=1000;i--){
                int x=check(i);
                if(x==s){
                    return i;
                }
            }
            return -1;
        }
        if(n==5){
            for(int i=99999;i>=10000;i--){
                int x=check(i);
                if(x==s){
                    return i;
                }
            }
            return -1;
        }
        return -1;
    }
    public int check(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n=n/10;
        }
        return sum;
    }
}