class Solution {
    public int minOperations(int[][] grid, int x) {
        ArrayList<Integer> res=new ArrayList<>();
        int temp=grid[0][0]%x;
        for(int t[]:grid){
            for(int y:t){
                if(y%x!=temp)return -1;
                res.add(y);
            }
        }
        Collections.sort(res);
        int mid=res.get(res.size()/2);
        int ans=0;
        for(int q:res){
            ans+=Math.abs(mid-q)/x;
        }
        return ans;
    }
}