class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n=mat.length;
        int m=mat[0].length;
        if(r*c!=m*n){
            return mat;
        }
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                res.add(mat[i][j]);
            }
        }
        int arr[][]=new int[r][c];
        int k=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=res.get(k);
                k++;
            }
        }    
        return arr;    
    }
}