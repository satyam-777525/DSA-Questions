class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {

        HashSet<String> set = new HashSet<>();
        for(int[] o:obstacles){
            set.add(o[0]+","+o[1]);
        }

        int x =0;
        int y=0;
        int dir=0; 
        int[]dx={0,1,0,-1};
        int[] dy={1,0,-1,0};
        int max=0;

        for(int cd:commands){
            if(cd==-1){ // right
                dir=(dir+1)%4;
            }
            else if(cd==-2){ // left
                dir=(dir+3)%4;
            }
            else{
                for(int i=0;i<cd;i++){
                    int nx=x+dx[dir];
                    int ny=y+dy[dir];

                    if(set.contains(nx+","+ny)) break;
                    x=nx;
                    y=ny;
                    max= Math.max(max,x*x +y*y);
                }
            }
        }

        return max;
    }
}