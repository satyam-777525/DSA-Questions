class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n=arr.length;
        int ans=0;
        int left=0;
        int sum=0;
        for(int right=0;right<n;right++){
            sum+=arr[right];
            if(right-left>=k){
                sum-=arr[left];
                left++;
            }
            if(right-left==k-1){
                int avg=sum/k;
                if(avg>=threshold){
                    ans++;
                }
            }
        }
        return ans;
    }
}