class Solution {
    public String simplifyPath(String path) {
        Stack<String> st=new Stack<>();
        String []str=path.split("/");

        for(String s:str){
            if(s.equals(".")||s.equals(""));
            else if(s.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }else{
                st.push(s);
            }
        }
        String ans="";
        for(String x:st){
            ans=ans+"/"+x;
        }
        return ans.length()==0?"/":ans;
    }
}