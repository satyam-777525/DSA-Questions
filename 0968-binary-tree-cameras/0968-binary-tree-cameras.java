class Solution {
    // 2- need nhi h camera ki 
    // 1- uss ke pass camera h 
    // 0-uss ke camera nhi h 
    int cameras=0;
    public  int helper(TreeNode root){
        if(root==null){
            return 2;
        }
        ;int left= helper(root.left);
        int right=helper(root.right);
        if(left==0||right==0){
            cameras++;
            return 1;
        }
        if(left==1||right==1){
            return 2;
        }
        return 0;
    }
    public int minCameraCover(TreeNode root) {
        if(helper(root)==0){
            cameras++;
        }
        return cameras;
        
    }
}