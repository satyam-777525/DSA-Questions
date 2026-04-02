class Solution {
    public int countNicePairs(int[] nums) {
        int mod=1000000007;
        int [] rev=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            StringBuilder sb=new StringBuilder(String.valueOf(nums[i]));
            sb.reverse();
            rev[i]=Integer.parseInt(String.valueOf(sb));
        }
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int r=rev[i];
            int key=nums[i]-r;
            if(map.containsKey(key)){
                count=(count+map.get(key))%mod;
            }
            map.put(key,map.getOrDefault(key,0)+1);
        }
        return count;
    }
}