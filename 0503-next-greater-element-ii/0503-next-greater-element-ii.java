class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int ans[]=new int[nums.length];
        Arrays.fill(ans,-1);
        int n=nums.length;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<2*n;i++){
            int idx=i%n;
            while(!st.isEmpty()&&nums[st.peek()]<nums[idx]){
                ans[st.pop()]=nums[idx];
            }
            if(i<n){
                st.push(idx);
            }

        }
        return ans;
    }
}