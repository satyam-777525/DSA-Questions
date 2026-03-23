class Solution {
    public int maxProductPath(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;

        long max[][]=new long[n][m];
        long min[][]=new long[n][m];
        max[0][0]=grid[0][0];
        min[0][0]=grid[0][0];

        for(int i=1;i<m;i++){
            max[0][i]=min[0][i]=max[0][i-1]*grid[0][i];
        }
        for(int i=1;i<n;i++){
            max[i][0]=min[i][0]=max[i-1][0]*grid[i][0];
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                int x=grid[i][j];

                long a=max[i][j-1]*x;
                long b=min[i][j-1]*x;
                long c=max[i-1][j]*x;
                long d=min[i-1][j]*x;

                max[i][j]=Math.max(Math.max(a,b),Math.max(c,d));
                min[i][j]=Math.min(Math.min(a,b),Math.min(c,d));
            }
        }
        long ans=max[n-1][m-1];
        return ans<0?-1:(int)(ans % 1000000007);
        
    }
}