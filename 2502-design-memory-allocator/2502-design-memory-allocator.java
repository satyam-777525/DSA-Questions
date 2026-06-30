class Allocator {
    int m[];
    int l;
    public Allocator(int n) {
        l=n;
        m=new int[n];
        Arrays.fill(m,-1);
    }
    
    public int allocate(int size, int mID) {
        int count=0;
        for(int i=0;i<l;i++){
            if(m[i]==-1){
                count++;
            }else{
                count=0;
            }
            if(count==size){
                int st=i-size+1;
                for(int j=st;j<=i;j++){
                    m[j]=mID;
                }
                return st;
            }
        }
        return -1;
    }
    
    public int freeMemory(int mID) {
        int count=0;
        for(int i=0;i<l;i++){
            if(m[i]==mID){
                count++;
                m[i]=-1;
            }
        }
        return count;
    }
}

