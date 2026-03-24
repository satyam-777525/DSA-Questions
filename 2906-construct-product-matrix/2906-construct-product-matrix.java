class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int res[]=new int[n*m];
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                res[k++]=grid[i][j];
            }
        }
        long[] prefix=new long[res.length];
        long suffix[]=new long[res.length];
        int l=res.length;
        prefix[0]=1;
        suffix[n*m-1]=1;
        for(int i=1;i<res.length;i++){
            prefix[i]=(prefix[i-1]*res[i-1])%12345;
        }
        for(int i=l-2;i>=0;i--){
            suffix[i]=(suffix[i+1]*res[i+1])%12345;
        }
        int x=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                grid[i][j]=(int)(prefix[x]*suffix[x])%12345;
                x++;
            }
        }
        return grid;
    }
}