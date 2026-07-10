class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> res=new ArrayList<>();
        solve(1,n,k,ans,res);
        return ans;
    }
    public void solve(int st,int end,int k,List<List<Integer>> ans,List<Integer> res){
        if(res.size()==k){
            ans.add(new ArrayList<>(res));
            return ;
        }
        for(int i=st;i<=end;i++){
            res.add(i);
            solve(i+1,end,k,ans,res);
            res.remove(res.size()-1);
        }
    }
}