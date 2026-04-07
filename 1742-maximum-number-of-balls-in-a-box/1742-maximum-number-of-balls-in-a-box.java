class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=lowLimit;i<=highLimit;i++){
            String s=""+i;
            if(s.length()==1){
                map.put(i,map.getOrDefault(i,0)+1);
            }else{
                int x=digitsum(i);
                map.put(x,map.getOrDefault(x,0)+1);
            }
        }
        int max=0;
        for(int x:map.values()){
            max=Math.max(max,x);
        }
        return max;
        
    }
    public int digitsum(int x){
        int sum=0;
        while(x>0){
            sum+=x%10;
            x=x/10;
        }
        return sum;
    }
}