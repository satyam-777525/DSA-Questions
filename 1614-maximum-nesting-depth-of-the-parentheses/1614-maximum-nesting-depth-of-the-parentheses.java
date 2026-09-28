class Solution {
    public int maxDepth(String s) {
        Stack<Integer> st=new Stack<>();
        int max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(i);
                max=Math.max(max,st.size());
            }
            if(s.charAt(i)==')'){
                st.pop();
            }
        }
        return max;
    }
}