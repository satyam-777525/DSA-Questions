class Solution {
    public int[][] rotateGrid(int[][] grid, int k) {
        int n=grid.length;
        int m=grid[0].length;

        int layer=Math.min(n,m)/2;

        for(int i=0;i<layer;i++){
            ArrayList<Integer> res=new ArrayList<>();
            for(int j=i;j<m-i;j++){
                res.add(grid[i][j]);
            }
            for(int j=i+1;j<n-i-1;j++){
                res.add(grid[j][m-i-1]);
            }
            for(int j=m-i-1;j>=i;j--){
                res.add(grid[n-i-1][j]);
            }
            for(int j=n-i-2;j>i;j--){
                res.add(grid[j][i]);
            }
            int l=res.size();
            int r=k%l;

            ArrayList<Integer> rotate=new ArrayList<>();
            for(int z=r;z<l;z++){
                rotate.add(res.get(z));
            }
            for(int z=0;z<r;z++){
                rotate.add(res.get(z));
            }
            int idx=0;
            for(int j=i;j<m-i;j++){
                grid[i][j]=rotate.get(idx++);
            }
            for(int j=i+1;j<n-i-1;j++){
                grid[j][m-i-1]=rotate.get(idx++);
            }
            for(int j=m-i-1;j>=i;j--){
                grid[n-i-1][j]=rotate.get(idx++);
            }
            for(int j=n-i-2;j>i;j--){
                grid[j][i]=rotate.get(idx++);
            }


            
        }
        return grid;
        
    }
}