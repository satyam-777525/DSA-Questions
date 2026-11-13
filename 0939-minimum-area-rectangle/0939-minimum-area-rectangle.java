class Solution {
    public int minAreaRect(int[][] points) {
        int n=points.length;
        int m=points[0].length;
        int maxarea=Integer.MAX_VALUE;
        HashSet<String> set=new HashSet<>();
        for(int p[]:points){
            String x=(p[0]+","+p[1]);
            set.add(x);
        }

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int x1=points[i][0];
                int y1=points[i][1];

                int x2=points[j][0];
                int y2=points[j][1];

                if(x1==x2||y1==y2) continue;
                String p1=x1+","+y2;
                String p2=x2+","+y1;

                if(set.contains(p1)&&set.contains(p2)){
                    int area=Math.abs(x1-x2)*Math.abs(y1-y2);
                    maxarea=Math.min(maxarea,area);
                }

            }
        }

        return maxarea==Integer.MAX_VALUE?0:maxarea;
    }
}