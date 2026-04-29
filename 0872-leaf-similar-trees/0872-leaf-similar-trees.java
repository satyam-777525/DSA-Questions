class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> list1=new ArrayList<>();
        pre(root1,list1);
        ArrayList<Integer> list2=new ArrayList<>();
        pre(root2,list2);

        return list1.equals(list2);
        
    }
    public void pre(TreeNode root,ArrayList<Integer> list){
        if(root==null) return ;
        if(root.left==null && root.right==null){
             list.add(root.val);
             return ;
        }
        pre(root.left,list);
        pre(root.right,list);
    }
}