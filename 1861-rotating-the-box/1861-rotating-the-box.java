class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        int row=boxGrid.length;
        int col=boxGrid[0].length;

        for(int i=0;i<row;i++){
            int empty=col-1;
            for(int j=col-1;j>=0;j--){
                if(boxGrid[i][j]=='*'){
                    empty=j-1;
                }
                else if(boxGrid[i][j]=='#'){
                    boxGrid[i][j] = '.';
                    boxGrid[i][empty] = '#';
                    empty--;
                }
            }
        }
        char [][]ans=new char[col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                ans[j][row-1-i]=boxGrid[i][j];
            }
        }
        return ans;


       
    }
}   