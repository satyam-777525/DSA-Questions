class Solution {
    public int longestSubsequence(int[] nums) {
        int help[]=nums;
        int xor=0;
        boolean a=false;
        for(int x:nums){
            xor^=x;
            if(x!=0) a=true;
        }
        int n=help.length;

        if(xor!=0){
            return n;
        }
        else if(n>1 && a){
            return n-1;
        }
        else{
            return 0;
        }
    }
}