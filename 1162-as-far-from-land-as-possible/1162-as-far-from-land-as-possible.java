class Solution {
    int rows;
    int cols;

    public int maxDistance(int[][] grid) {
        rows=grid.length;
        cols=grid[0].length;
        int count=-1;
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==1){
                    q.add(new int[]{i,j});
                }
            }
        }
        if(q.isEmpty() || q.size() == rows * cols){
            return -1;
        }
        while(!q.isEmpty()){
            int size=q.size();
            count++;
            for(int i=0;i<size;i++){
                int []a=q.poll();
                int r=a[0];
                int c=a[1];
                int adj[][]={{1,0},{0,1},{-1,0},{0,-1}};
                for(int neigh[]:adj){
                    int x=neigh[0];
                    int y=neigh[1];
                    if(x+r<0 || c+y<0 ||x+r>=rows||y+c>=cols||grid[x+r][c+y]==1){
                        continue;
                    }
                    grid[x+r][y+c]=1;
                    q.add(new int[]{x+r,y+c});
                }
            }
            
        }

        return count;
    }
}