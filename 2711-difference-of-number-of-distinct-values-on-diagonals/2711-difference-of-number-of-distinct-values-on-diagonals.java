class Solution {
    public int[][] differenceOfDistinctValues(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int ans[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int x=i;
                int y=j;
                HashSet<Integer> above=new HashSet<>();
                while(x-1>=0 && y-1>=0){
                    above.add(grid[x-1][y-1]);
                    x--;
                    y--;
                }
                int a=i;
                int b=j;
                HashSet<Integer> low=new HashSet<>();
                while(a+1<n && b+1<m){
                    low.add(grid[a+1][b+1]);
                    a++;
                    b++;
                }
                ans[i][j]=Math.abs(above.size()-low.size());
            }
        }
        return ans;
    }
}