class Solution {
    public int findGCD(int[] nums) {
        int a=Integer.MAX_VALUE;
        int b=Integer.MIN_VALUE;
        for(int x:nums){
            a=Math.min(a,x);
            b=Math.max(b,x);
        }
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
        
    }
}