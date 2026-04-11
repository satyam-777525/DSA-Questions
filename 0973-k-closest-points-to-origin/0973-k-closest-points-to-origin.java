class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] ans=new int[k][2];
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->Integer.compare(a[0],b[0]));
        for(int a[]:points){
            int dist=a[0]*a[0]+a[1]*a[1];
            pq.add(new int[]{dist,a[0],a[1]});
        }
        int i=0;
        while(k>0){
            int a[]=pq.poll();
            ans[i][0]=a[1];
            ans[i][1]=a[2];
            k--;
            i++;
        }
        return ans;
        
    }
}