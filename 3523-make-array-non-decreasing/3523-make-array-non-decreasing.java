class Solution {
    public int maximumPossibleSize(int[] nums) {
        Stack<Integer> st=new Stack<>();
        for(int x:nums){
            if(st.isEmpty()){
                st.push(x);
            }
            if(st.peek()<=x){
                st.push(x);
            }
        }
        return st.size()-1;
    }
}