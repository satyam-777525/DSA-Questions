class Solution {
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int x=fun(nums[i]);
            min=Math.min(x,min);
        }
        return min;
        
    }
    public static int fun(int n){
        int sum=0;
        while(n>0){
            int x=n%10;
            sum+=x;
            n=n/10;
        }
        return sum;
    }
}