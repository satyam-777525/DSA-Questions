class BSTIterator {
    ArrayList<Integer> res;
    int temp;
    public BSTIterator(TreeNode root) {
        res=new ArrayList<>();
        inorder(root);
        temp=0;
    }
    public void inorder(TreeNode root){
        if(root==null) return ;
        inorder(root.left);
        res.add(root.val);
        inorder(root.right);
    }
    
    public int next() {
        int x=res.get(temp);
        if(temp<res.size()){
            temp=temp+1;
            return x;
        }
        return 0;
        
    }
    
    public boolean hasNext() {
        if(temp<res.size()){
            return true;
        }
        return false;
    }
}
