class Solution {
    int max;
    public int longestZigZag(TreeNode root) {
        max=0;
        dfs(root.left,"left",1);
        dfs(root.right,"right",1);
        return max;
        
    }
    public void dfs(TreeNode root,String dir,int count){
        if(root==null) return;
        max=Math.max(count,max);
        if(dir.equals("left")){
            dfs(root.right,"right",count+1);
            dfs(root.left,"left",1);

        }
        if(dir.equals("right")){
            dfs(root.left,"left",count+1);
            dfs(root.right,"right",1);
        }
    }
}