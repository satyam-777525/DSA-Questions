class Solution {
    public int maximumJumps(int[] nums, int target) {
        int n=nums.length;
        int arr[]=new int[n];
        Arrays.fill(arr,-1);
        arr[0]=0;
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(Math.abs(nums[i]-nums[j])<=target && arr[j]!=-1){
                    arr[i]=Math.max(arr[i],arr[j]+1);
                }
            }
        }
        return arr[n-1];
    }
}