class Solution {
    public int gcd(int a,int b){
        while(b!=0){
            int t=b;
            b=a%b;
            a=t;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        int n=nums.length;
        int pregcd[]=new int[n];
        int max=0;

        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            pregcd[i]=gcd(max,nums[i]);
        }
        Arrays.sort(pregcd);

        long sum=0;
        int left=0;
        int right=n-1;
        while(left<right){
            sum+=gcd(pregcd[left],pregcd[right]);
            left++;
            right--;
        }
        return sum;
    }
}