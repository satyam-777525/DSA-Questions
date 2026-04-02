class Solution {
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        int max[][]=new int[n][2];
        for(int i=0;i<n;i++){
            max[i][0]=efficiency[i];
            max[i][1]=speed[i];
        }
        Arrays.sort(max,(a,b)->b[0]-a[0]);
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->a-b);
        long res=0;
        long sum=0;
        for(int[] m:max){
            pq.add(m[1]);
            sum+=m[1];
            if(pq.size()>k) sum-=pq.poll();
            res=Math.max(res,sum*m[0]);
        }
        return (int)(res % 1000000007);
    }
}