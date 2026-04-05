class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='#'){
                st.push(i);
            }
            if(s.charAt(i)=='#'&&!st.isEmpty()){
                st.pop();
            }
        }
        String ans1="";
        while(!st.isEmpty()){
            ans1=s.charAt(st.pop())+ans1;
        }
        Stack<Integer> st1=new Stack<>();
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)!='#'){
                st1.push(i);
            }
            if(t.charAt(i)=='#'&&!st1.isEmpty()){
                st1.pop();
            }
        }
        String ans2="";
        while(!st1.isEmpty()){
            ans2=t.charAt(st1.pop())+ans2;
        }
        if(ans1.equals(ans2)) return true;
        return false;
    }
}