class Solution {
    int maxsum=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
       dfs(root);
        return maxsum;
    }
    public int dfs(TreeNode root){
        if(root==null) return 0;

        int left=Math.max(0,dfs(root.left));
        int right=Math.max(0,dfs(root.right));
        int currsum=root.val+left+right;

        maxsum=Math.max(maxsum,currsum);

        return root.val+Math.max(left,right);

    }
    
}