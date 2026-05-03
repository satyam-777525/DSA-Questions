class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> combinationSum3(int k, int n) {
        ans=new ArrayList<>();
        helper(1,k,n,new ArrayList<>());
        return ans;
    }
    public void helper(int st,int k,int target,List<Integer> res){
        if(res.size()==k && target==0){
            ans.add(new ArrayList<>(res));
            return;
        }
        if(res.size()>k||target<0) return ;
        for(int i=st;i<=9;i++){
            res.add(i);
            helper(i+1,k,target-i,res);
            res.remove(res.size()-1);
        }
    }
}
 
 
// 1 2 3 4 5 6 7 8 9
// 1 2 3 -no
// 1 2 4 -yes

