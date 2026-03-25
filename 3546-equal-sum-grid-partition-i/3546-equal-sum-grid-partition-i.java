class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        long row[]=new long[n];
        long col[]=new long[m];

        long rsum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                row[i]+=grid[i][j];
            }
            rsum+=row[i];
        }
        long csum=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                col[i]+=grid[j][i];
            }
            csum+=col[i];
        }
        long rprefix=0;
        for(int i=n-1;i>=0;i--){
            rprefix+=row[i];
            if(rsum-rprefix==rprefix){
                return true;
            }
        }

        long prefix=0;
        for(int i=m-1;i>=0;i--){
            prefix+=col[i];
            if(csum-prefix==prefix){
                return true;
            }
        }
        return false;
        
    }
}