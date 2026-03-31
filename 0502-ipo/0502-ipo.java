class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n=profits.length;
        int max[][]=new int[n][2];
        for(int i=0;i<n;i++){
            max[i][0]=capital[i];
            max[i][1]=profits[i];
        }
        Arrays.sort(max,(a,b)->(a[0]-b[0]));
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

        int j=0;
        for(int i=0;i<k;i++){

            while(j<n && max[j][0]<=w){
                pq.add(max[j][1]);
                j++;
            }
            if(pq.size()==0) break;
            w+=pq.poll();

        }
        return w;
    }
}