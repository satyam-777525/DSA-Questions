class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        ans=new ArrayList<>();
        Arrays.sort(candidates);
        helper(0,candidates,target,new ArrayList<>());
        return ans;
    }
    public void helper(int idx,int nums[],int target,List<Integer> res){
        if(target<0){
            return ;
        }
        if(target==0){
            ans.add(new ArrayList<>(res));
        }
        for(int i=idx;i<nums.length;i++){
            if(i>idx && nums[i]==nums[i-1]) continue;
            if(nums[i]>target){
                break;
            }
            res.add(nums[i]);
            helper(i+1,nums,target-nums[i],res);
            res.remove(res.size()-1);
        }
    }
}