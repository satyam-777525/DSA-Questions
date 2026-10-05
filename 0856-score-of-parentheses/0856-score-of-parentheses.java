class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='('){
                st.push(0);
            }
            if(ch==')'){
                if(st.peek()==0){
                    st.pop();
                    st.push(1);
                }else{
                    int sum=0;
                    while(st.peek()!=0){
                        sum+=st.pop();
                    }
                    st.pop();
                    st.push(sum*2);
                }
            }
        }
        int ans=0;
        while(!st.isEmpty()){
            ans+=st.pop();
        }
        return ans;
    }
}