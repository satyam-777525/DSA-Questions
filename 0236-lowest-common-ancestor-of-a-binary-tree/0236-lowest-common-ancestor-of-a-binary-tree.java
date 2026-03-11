/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean contains(TreeNode root,TreeNode node){
        if(root==null) return false;
        if(root==node) return true;
        boolean left=contains(root.left,node);
        boolean right=contains(root.right,node);
        return left||right;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return root;
        if(p==root||q==root) return root;
        if(p==q) return p;
        boolean left=contains(root.left,p);
        boolean right=contains(root.right,q);
        if(left==true && right==true) return root;
        if(left==true && right==false) return lowestCommonAncestor(root.left,p,q);
        if(left==false && right==true) return lowestCommonAncestor(root.right,p,q);
        if(left==false && right==false) return root;
        return root;

    }
}