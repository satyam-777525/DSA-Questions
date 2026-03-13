class Solution {
    int sum=0;
   public void helper(TreeNode root){
    if(root==null) return ;
    helper(root.right);
    root.val=sum+root.val;
    sum=root.val;
    helper(root.left);
   }
    public TreeNode convertBST(TreeNode root) {
        helper(root);
        return root;
        
    }
}