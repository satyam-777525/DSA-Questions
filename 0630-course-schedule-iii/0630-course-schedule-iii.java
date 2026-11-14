class Solution {
    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses,(a,b)->(a[1]-b[1]));
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        int time=0;
        for(int c[]:courses){
            int x=c[0];
            int y=c[1];
            time+=x;
            pq.add(x);
            if(time>y){
                time-=pq.poll();
            }
            
        }
        return pq.size();
        
    }
}