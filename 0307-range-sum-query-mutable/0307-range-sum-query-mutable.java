class NumArray {
    int tree[];
    int n;
    public NumArray(int[] nums) {
        n=nums.length;
        tree=new int[4*n];
        build(nums,1,0,n-1);
        
    }
    int merge(int x,int y){
        return x+y;
    }
    void build(int arr[],int node,int start,int end){
        if(start==end){
            tree[node]=arr[start];
            return;
        }
        int mid=(start+end)/2;
        build(arr,2*node,start,mid);
        build(arr,2*node+1,mid+1,end);
        tree[node]=merge(tree[2*node],tree[2*node+1]);
    }

    
    public void update(int idx, int val) {
        update1(1,0,n-1,idx,val);
    }
    public void update1(int node,int start,int end,int idx,int val){
        if(start==idx && end==idx){
            tree[node]=val;
            return;
        }
        int mid=(start+end)/2;
        if(idx<=mid) update1(node*2,start,mid,idx,val);
        else update1(node*2+1,mid+1,end,idx,val);

        tree[node]=merge(tree[2*node],tree[2*node+1]);
    }

    
    public int sumRange(int left, int right) {
        return query( 1, 0, n-1, left, right);
    }
    public int query(int node,int start,int end,int left,int right){
        if(right<start ||end<left) return 0;
        if(left<=start && end<=right) return tree[node];

        int mid=(start+end)/2;
        int l=query(2*node,start,mid,left,right);
        int r=query(2*node+1,mid+1,end,left,right);

        return merge(l,r);
    }
}
