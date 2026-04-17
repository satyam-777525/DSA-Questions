class Solution {
    public int minMirrorPairDistance(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int min=Integer.MAX_VALUE;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                min=Math.min(min,i-map.get(nums[i]));
            }
            
            map.put(reverse(nums[i]),i);
        }
      
        return (min==Integer.MAX_VALUE)?-1:min;
        
    }
  
    public static int reverse(int n){
       int x=n;
        int rev=0;
        while(x>0){
            int digit=x%10;
            rev=rev*10+digit;
            x=x/10;
        }
        return rev;
    }
}