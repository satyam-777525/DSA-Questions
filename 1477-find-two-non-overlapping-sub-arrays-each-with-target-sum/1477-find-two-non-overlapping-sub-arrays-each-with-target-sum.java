class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n=arr.length;
        int best[]=new int[n];
        Arrays.fill(best,1000000000);
        int left=0;
        int sum=0;
        int len=0;
        int minlen=1000000000;
        int ans=1000000000;
        for(int right=0;right<arr.length;right++){
            sum+=arr[right];
            while(sum>target){
                sum=sum-arr[left];
                left++;
            }
            if (right > 0) {
                best[right] = best[right - 1];
            }
            if (sum == target) {
                int currentLen = right - left + 1;
                if (left > 0 && best[left - 1] != 1000000000) {
                    ans = Math.min(ans, currentLen + best[left - 1]);
                }

                minlen = Math.min(minlen, currentLen);
                best[right] = Math.min(best[right], minlen);
            }

        }
        return ans==1000000000?-1:ans;
    }
}