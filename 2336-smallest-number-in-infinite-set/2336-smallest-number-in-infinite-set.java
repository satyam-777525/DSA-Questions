class SmallestInfiniteSet {
    boolean arr[];
    public SmallestInfiniteSet() {
        arr=new boolean[1001];
        Arrays.fill(arr,true);
        
    }
    
    public int popSmallest() {
        int x=0;
        for(int i=1;i<1001;i++){
            if(arr[i]==true){
                arr[i]=false;
                x=i;
                break;
            }
        }
        return x;
    }
    
    public void addBack(int num) {
        if(arr[num]==true){
            return;
        }
        arr[num]=true;

        
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */