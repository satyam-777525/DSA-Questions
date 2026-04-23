
class Solution {
    public TreeNode reverseOddLevels(TreeNode root) {
        reverse(root.left,root.right,1);
        return root;     
    }
    public void reverse(TreeNode left,TreeNode right,int lvl){
        if(left==null ||right==null) return;
        if(lvl%2==1){
            int temp=left.val;
            left.val=right.val;
            right.val=temp;
        }
        reverse(left.left,right.right,lvl+1);
        reverse(left.right,right.left,lvl+1);
    }
}