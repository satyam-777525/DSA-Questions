class NeighborSum {
    int n;
    int m;
    int arr[][];
    public NeighborSum(int[][] grid) {
        arr=grid;
        n=grid.length;
        m=grid[0].length;
        
    }
    
    public int adjacentSum(int value) {
        int x=0;
        int y=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==value){
                    x=i;
                    y=j;
                }
            }
        }
        int sum=0;
        if(x-1>=0) sum+=arr[x-1][y];
        if(x+1<n) sum+=arr[x+1][y];
        if(y-1>=0) sum+=arr[x][y-1];
        if(y+1<m) sum+=arr[x][y+1];

        return sum;
        
    }
    
    public int diagonalSum(int value) {
        int x=0;
        int y=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==value){
                    x=i;
                    y=j;
                }
            }
        }
        int sum=0;
        if(x-1>=0&&y-1>=0) sum+=arr[x-1][y-1];
        if(x-1>=0&&y+1<m) sum+=arr[x-1][y+1];
        if(x+1<n&&y-1>=0) sum+=arr[x+1][y-1];
        if(x+1<n&&y+1<m) sum+=arr[x+1][y+1];

        return sum;
        
    }
}

