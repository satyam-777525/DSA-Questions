class Solution {
    public void post(TreeNode root,ArrayList<Integer> res){
        if(root==null){
            return ;
        }
        res.add(root.val);
        post(root.left,res);
        post(root.right,res);
    }
    public int findSecondMinimumValue(TreeNode root) {
        ArrayList<Integer> res=new ArrayList<>();
        post(root,res);
        Collections.sort(res);
        int min=res.get(0);
        for(int x:res){
            if(x>min){
                return x;
            }
        }
        return -1;
    }
}