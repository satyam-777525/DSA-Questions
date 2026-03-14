class Solution {
    ArrayList<String> list=new ArrayList<>();
    public String getHappyString(int n, int k) {
        helper(n,"");
        if(list.size()<k) return "";
        return list.get(k-1);
    }
    public void helper(int n,String s){
        if(s.length()==n){
            list.add(s);
            return ;
        }
        char ch[]={'a','b','c'};
        for(char c:ch){
            if(s.length()>0 && s.charAt(s.length()-1)==c){
                continue;
            }
            helper(n,s+c);
        }
    }
}