class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int c=1;
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> res=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                res.add(node.val);
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
            }
            if(c%2==0){
                Collections.reverse(res);
            }
            c++;
            ans.add(res);
        }
        return ans;
        
    }
}