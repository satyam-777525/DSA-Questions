class Solution {
    public int goodNodes(TreeNode root) {
        int good=0;
        good=dfs(root,root.val);
        return good;
    }
    public static int dfs(TreeNode root,int max){
        if(root==null) return 0;
        int count=0;
        if(root.val>=max){
            count++;
            max=root.val;
        }
        count+=dfs(root.left,max);
        count+=dfs(root.right,max);
        return count;
    }
}