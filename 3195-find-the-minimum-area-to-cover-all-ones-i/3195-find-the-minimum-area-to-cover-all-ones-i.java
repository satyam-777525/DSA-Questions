class Solution {
    public int minimumArea(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        ArrayList<int[]> res=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    res.add(new int[]{i,j});
                }
            }
        }
        int rmin =Integer.MAX_VALUE;
        int rmax =Integer.MIN_VALUE;
        int cmin =Integer.MAX_VALUE;
        int cmax =Integer.MIN_VALUE;
        for(int a[]:res){
            int x=a[0];
            int y=a[1];
            rmin=Math.min(rmin,x);
            rmax=Math.max(rmax,x);
            cmax=Math.max(cmax,y);
            cmin=Math.min(cmin,y);
        }
        int r=rmax-rmin+1;
        int c=cmax-cmin+1;
        return r*c;
    }
}