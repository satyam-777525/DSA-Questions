class Solution {
    public List<List<Integer>> aggregateTimeSeries(int[][] series1, int[][] series2) {
        List<List<Integer>> res=new ArrayList<>();
        int n1=series1.length;
        int n2=series2.length;
        int i=0;
        int j=0;
        while(i<n1 &&j<n2){
            int x[]=series1[i];
            int y[]=series2[j];
            if(x[0]==y[0]){
                int val=x[1]+y[1];
                res.add(Arrays.asList(x[0],val));
                i++;
                j++;
            }
            if(x[0]<y[0]){
                int val=x[1]+y[1];
                res.add(Arrays.asList(x[0],val));
                i++;
            }
            if(x[0]>y[0]){
                int val=x[1]+y[1];
                res.add(Arrays.asList(y[0],val));
                j++;
            }
        }
        while(i<n1){
            int x[]=series1[i];
            res.add(Arrays.asList(x[0],x[1]));
            i++;
        }
        while(j<n2){
            int y[]=series2[j];
             res.add(Arrays.asList(y[0],y[1]));
            j++;
        }

        Collections.sort(res,(a,b)->a.get(0)-b.get(0));
        return res;

    }
}