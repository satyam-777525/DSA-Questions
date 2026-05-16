class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        helper(s,new ArrayList<>(),ans);
        return ans;
    }
    public void helper(String s,List<String> res,List<List<String>> ans){
        if(s.length()==0){
            ans.add(new ArrayList<>(res));
            return;
        }
        for(int i=0;i<s.length();i++){
            String pal=s.substring(0,i+1);
            if(palindrome(pal)){
                res.add(pal);
                helper(s.substring(i+1),res,ans);
                res.remove(res.size()-1);
            }
        }
    }
    public boolean palindrome(String s){
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        String x=sb.toString();
        if(x.equals(s)){
            return true;
        }
        return false;
    }
}