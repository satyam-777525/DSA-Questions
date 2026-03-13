
class Solution {
    public void inorder(TreeNode root,ArrayList<Integer> res){
        if(root==null) return ; 
        inorder(root.left,res);
        res.add(root.val);
        inorder(root.right,res);
    }
    public TreeNode increasingBST(TreeNode root) {
        ArrayList<Integer> res=new ArrayList<>();
        inorder(root,res);
        TreeNode ans=new TreeNode(100);
        TreeNode temp=ans;
        for(int i=0;i<res.size();i++){
            temp.right=new TreeNode(res.get(i));
            temp=temp.right;
        }
        return ans.right;
    }
}