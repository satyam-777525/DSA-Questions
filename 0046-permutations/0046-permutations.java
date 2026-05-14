class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        helper(ans,new ArrayList<>(),nums);
        return ans;
        
    }
    public void helper(List<List<Integer>> ans,List<Integer>res,int nums[]){
        if(res.size()==nums.length){
            ans.add(new ArrayList<>(res));
            return;
        }
        for(int x:nums){
            if(res.contains(x)){
                continue;
            }
            res.add(x);
            helper(ans,res,nums);
            res.remove(res.size()-1);
        }
    }
}