class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> res=new ArrayList<>();
        while(k>0){
            int n=grid.length;
            int m=grid[0].length;
            int arr[][]=new int[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m-1;j++){
                    arr[i][j+1]=grid[i][j];
                }
            }
            for(int i=0;i<n-1;i++){
                arr[i+1][0]=grid[i][m-1];
            }
            arr[0][0]=grid[n-1][m-1];
            grid=arr;
            k--;
        }
        for(int i=0;i<grid.length;i++){
            List<Integer> r=new ArrayList<>();
            for(int j=0;j<grid[0].length;j++){
                r.add(grid[i][j]);
            }
            res.add(r);
        }
        return res;
    }
}