class Solution {
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashMap<Integer,TreeNode> map=new HashMap<>();
        HashSet<Integer> set=new HashSet<>();
        for(int d[]:descriptions){
            int parent=d[0];
            int child=d[1];
            int dir=d[2];
            if(!map.containsKey(parent)) map.put(parent,new TreeNode(parent));
            if(!map.containsKey(child)) map.put(child,new TreeNode(child));

            if(dir==1){
                map.get(parent).left=map.get(child);
            }else{
                map.get(parent).right=map.get(child);
            }
            set.add(child);      
        }
        for(int x:map.keySet()){
            if(!set.contains(x)){
                return map.get(x);
            }
        }
        return null;

    }
}