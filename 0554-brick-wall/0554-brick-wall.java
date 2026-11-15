class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        int n=wall.size();
        long sum=0;
        for(int x:wall.get(0)){
            sum+=x;
        }
        HashMap<Long,Integer> map=new HashMap<>();
        for(List<Integer> w:wall){
            long count=0;
            for(int x:w){
                count+=x;
                if(count!=sum){
                    map.put(count,map.getOrDefault(count,0)+1);
                }
            }
        }
        int max=0;
        for(int x:map.values()){
            max=Math.max(max,x);
        }
        return n-max;
        
    }
}
// 1-3
// 3-3
// 5-2
// 4-4
// 2-1