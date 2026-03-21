class Solution {
    int row;
    int col;
    public int[][] findFarmland(int[][] land) {
        row=land.length;
        col=land[0].length;
        ArrayList<int[]> res=new ArrayList<>();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(land[i][j]==1){
                    int[] bound={i,j,i,j};
                    dfs(land,i,j,bound);
                    res.add(bound);
                }
            }
        }
        return res.toArray(new int[res.size()][]);
        
    }
    public void dfs(int [][]land,int i,int j,int[]b){
        if(i<0||j<0||i>=row||j>=col||land[i][j]==0){
            return;
        }
        land[i][j]=0;
        b[0]=Math.min(b[0],i);
        b[1]=Math.min(b[1],j);
        b[2]=Math.max(b[2],i);
        b[3]=Math.max(b[3],j);

        dfs(land, i+1, j, b);
        dfs(land, i-1, j, b);
        dfs(land, i, j+1, b);
        dfs(land, i, j-1, b);
    }
}