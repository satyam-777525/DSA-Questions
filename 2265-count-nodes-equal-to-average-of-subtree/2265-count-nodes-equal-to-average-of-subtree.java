
class Solution {
    int count;
    public int averageOfSubtree(TreeNode root) {
        count=0;
        dfs(root);
        return count;
        
    }
    public void dfs(TreeNode root){
        if(root==null) return;
        int x=cnt(root);
        int y=sum(root);
        if((y/x)==root.val){
            count++;
        }
        dfs(root.left);
        dfs(root.right);
    }
    public int cnt(TreeNode root){
        if(root==null) return 0;
        return 1+cnt(root.left)+cnt(root.right);
    }
    public int sum(TreeNode root){
        if(root==null) return 0;
        return root.val+sum(root.left)+sum(root.right);
    }
}