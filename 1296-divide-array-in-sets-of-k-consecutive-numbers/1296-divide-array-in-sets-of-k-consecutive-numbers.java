class Solution {
    public boolean isPossibleDivide(int[] hand, int groupSize) {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int x:hand){
            map.put(x,map.getOrDefault(x,0)+1);
        }
       while(!map.isEmpty()){
        int top=map.firstKey();
        for(int i=0;i<groupSize;i++){
            int x=top+i;
            if(!map.containsKey(x)){
            return false;
            }
            map.put(x,map.get(x)-1);
            if(map.get(x)==0){
            map.remove(x);
        }
        }
        
        
        
        

       }
       return true;
        
    }
}



