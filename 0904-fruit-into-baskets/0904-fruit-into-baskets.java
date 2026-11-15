class Solution {
    public int totalFruit(int[] fruit) {
        int n=fruit.length;
        int max=0;
        int left=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int right=0;right<n;right++){
            map.put(fruit[right],map.getOrDefault(fruit[right],0)+1);
            while(map.size()>2){
                map.put(fruit[left],map.get(fruit[left])-1);
                if(map.get(fruit[left])==0){
                    map.remove(fruit[left]);
                }
                left++;
            }
            max=Math.max(max,right-left+1);
        
        }
        return max;
    }
}
// 1 2 3 2 2