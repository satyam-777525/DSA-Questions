class Solution {
    public int largestInteger(int[] nums, int k) {
        int n=nums.length;
        if(n==k) return Arrays.stream(nums).max().getAsInt();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
         if(k==1){
            int max=-1;
            for (int x:nums) {
                if(map.get(x)==1){
                    max =Math.max(max, x);
                }
            }
            return max;
        }
        int ans=-1;
        if(map.get(nums[0])==1){
            ans=Math.max(ans,nums[0]);
        }
        if(map.get(nums[n-1])==1){
            ans=Math.max(ans,nums[n-1]);
        }
        return ans;
        
    }
}