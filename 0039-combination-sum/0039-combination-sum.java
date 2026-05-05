class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
         ans=new ArrayList<>();
         helper(0,candidates,target,new ArrayList<>());
         return ans;      
    }
    public void helper(int idx,int nums[],int target,List<Integer> res){
        if(target==0){
            ans.add(new ArrayList<>(res));
            return;
        }
        if(idx==nums.length || target<0) return;
        res.add(nums[idx]);
        helper(idx,nums,target-nums[idx],res);
        res.remove(res.size()-1);
        helper(idx+1,nums,target,res);

    }
}
