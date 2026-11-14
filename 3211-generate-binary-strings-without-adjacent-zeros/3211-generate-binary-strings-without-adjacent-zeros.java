class Solution {
    List<String> ans;
    public List<String> validStrings(int n) {
        ans=new ArrayList<>();
        helper(1,new StringBuilder(),n);
        return ans;
    }
    public void helper(int prev,StringBuilder s,int n){
        if(s.length()==n){
            ans.add(s.toString());
            return;
        }
        s.append('1');
        helper(1,s,n);
        s.deleteCharAt(s.length()-1);
        if(prev==1){
            s.append('0');
            helper(0,s,n);
            s.deleteCharAt(s.length()-1);
        }


    }
}