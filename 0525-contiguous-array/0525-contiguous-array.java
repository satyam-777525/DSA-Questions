class Solution {
    public int findMaxLength(int[] nums) {
    HashMap<Integer,Integer> map=new HashMap<>();
    int maxlen=0;
    int sum=0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]==0){
            sum+=-1;
        }else{
            sum+=1;
        }
        if(sum==0){
            maxlen=i+1;
        }
        else if(map.containsKey(sum)){
            maxlen=Math.max(maxlen,i-map.get(sum));
        }else{
            map.put(sum,i);
        }
    }
    return maxlen;
    }
}