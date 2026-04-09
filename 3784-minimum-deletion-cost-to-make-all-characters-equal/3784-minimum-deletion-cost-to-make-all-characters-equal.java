class Solution {
    public long minCost(String s, int[] cost) {
        HashMap<Character,Long> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            long val=cost[i];
            if(!map.containsKey(ch)){
                map.put(ch,val);
            }else {
                map.put(ch,map.get(ch)+val);
            }
        }
        long sum=0;
        for(int x:cost){
            sum+=x;
        }
        long min=Long.MAX_VALUE;
        for(char ch:map.keySet()){
            long curr=sum-map.get(ch);
            min=Math.min(min,curr);
        }
        return min;
    }
}