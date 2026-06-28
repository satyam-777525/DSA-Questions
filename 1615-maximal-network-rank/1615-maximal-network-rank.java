class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        HashSet<String> set=new HashSet<>();
        int degree[]=new int[n];
        for(int []r:roads){
            int x=r[0];
            int y=r[1];
            set.add(x+"->"+y);
            set.add(y+"->"+x);
            degree[x]++;
            degree[y]++;
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int sum=degree[i]+degree[j];
                String x=i+"->"+j;
                String y=j+"->"+i;
                if(set.contains(x) ||set.contains(y)){
                    sum=sum-1;
                }
                max=Math.max(max,sum);
            }
        }
        return max;
    }
}

