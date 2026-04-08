class Solution {
    public long maxSum(List<Integer> nums, int m, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int left=0;
        long max=0;
        long sum=0;
        for(int right=0;right<nums.size();right++){
            int val=nums.get(right);
            map.put(val,map.getOrDefault(val,0)+1);
            sum+=val;
            if(right-left+1>k){
                int lval = nums.get(left);
                sum-=lval;
                map.put(lval,map.get(lval)-1);
                if(map.get(lval)==0){
                    map.remove(lval);
                }
                left++;
            }
            if (right-left+1==k) {
                if (map.size()>=m) {
                    max = Math.max(max, sum);
                }
            }

        }
        return max;
    }
}