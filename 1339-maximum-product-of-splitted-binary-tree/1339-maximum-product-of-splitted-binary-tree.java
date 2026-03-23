class Solution {
    long total=0;
    long maxsum=0;
    public int maxProduct(TreeNode root) {
        total=sum(root);

        dfs(root);

        return (int)(maxsum%1000000007);
        
    }
    public long dfs(TreeNode root){
        if(root==null) return 0;
        long left=dfs(root.left);
        long right=dfs(root.right);
        long curr=root.val+left+right;
        long prod=curr*(total-curr);
        maxsum=Math.max(maxsum,prod);

        return curr;
    }
    public long sum(TreeNode root){
        if(root==null) return 0;
        return root.val+sum(root.left)+sum(root.right);
    }
}