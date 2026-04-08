class Solution {
    public int maximumScore(int a, int b, int c) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        pq.add(a);
        pq.add(b);
        pq.add(c);
        int count=0;
        while(pq.size()>=2){
            int x=pq.poll();
            int y=pq.poll();
            if(x==0||y==0) break;
            count++;
            x--;
            y--;
            if(x!=0){
                pq.add(x);
            }
            if(y!=0){
                pq.add(y);
            }
        }

        return count;

    }
}


