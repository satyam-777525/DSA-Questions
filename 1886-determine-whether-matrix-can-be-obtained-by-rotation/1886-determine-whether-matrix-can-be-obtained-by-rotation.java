class Solution {
    int n;
    int m;
    public boolean findRotation(int[][] mat, int[][] target) {
        n=mat.length;
        m=mat[0].length;
        for(int i=0;i<4;i++){
            if(equal(mat,target)){
                return true;
            }
            mat=rotate(mat);
        }
        return false;
    }
    public int[][] rotate(int mat[][]){
        int ans[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans[j][n-1-i]=mat[i][j];
            }
        }
        return ans;
    }
    public boolean equal(int mat[][],int target[][]){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]!=target[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}