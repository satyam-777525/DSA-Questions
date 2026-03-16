
class Solution {
    public void inorder(TreeNode root,HashMap<Integer,Integer> map){
        if(root==null) return ;
        inorder(root.left,map);
        map.put(root.val,map.getOrDefault(root.val,0)+1);
        inorder(root.right,map);
    }
    public int[] findMode(TreeNode root) {
        HashMap<Integer,Integer> map=new HashMap<>();
        inorder(root,map);
        int freq=0;
        for(int x:map.values()){
            freq=Math.max(freq,x);
        }
        ArrayList<Integer> res=new ArrayList<>();
        for(int x:map.keySet()){
            if(map.get(x)==freq){
                res.add(x);
            }
        }
        int arr[]=new int[res.size()];
        for(int i=0;i<res.size();i++){
            arr[i]=res.get(i);
        }
        
        return arr;
    }
}