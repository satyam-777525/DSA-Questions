class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int l=q.size();
            int max=Integer.MIN_VALUE;;
            for(int i=0;i<l;i++){
                TreeNode x=q.poll();
                max=Math.max(max,x.val);
                if(x.left!=null){
                    q.add(x.left);
                }
                if(x.right!=null){
                    q.add(x.right);
                }
            }
            res.add(max);
        }
        return res;
        
    }
}