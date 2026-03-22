
class Solution {
    HashMap<String,Integer> map;
    List<TreeNode> res;
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        map=new HashMap<>();
        res=new ArrayList<>();
        serialize(root);
        return res;
        
    }
    public String serialize(TreeNode root){
        if(root==null){
            return "#";
        }
        String left=serialize(root.left);
        String right=serialize(root.right);
        String curr=root.val+","+left+","+right;

        map.put(curr,map.getOrDefault(curr,0)+1);

        if(map.get(curr)==2){
            res.add(root);
        }
        return curr;
    }
}