class Solution {
    public int[] assignTasks(int[] servers, int[] tasks) {
        PriorityQueue<int[]> avail=new PriorityQueue<>((a,b)->{
            if(a[0]!=b[0]) return a[0]-b[0];
            return a[1]-b[1];
    });
        PriorityQueue<int[]> busy=new PriorityQueue<>((a,b)->{
            if(a[2]!=b[2]) return a[2]-b[2];
            if (a[0] != b[0]) return a[0] - b[0];
            return a[1] - b[1];

    });
        int n=servers.length;
        int m=tasks.length;
        for(int i=0;i<n;i++){
            avail.add(new int[]{servers[i],i,0});
        }
        int ans[]=new int[m];

        for(int i=0;i<m;i++){
            while(!busy.isEmpty()&& busy.peek()[2]<=i){
                int[] server=busy.poll();
                avail.add(server);
            }

            if (avail.isEmpty()) {
                int time =busy.peek()[2];

                while (!busy.isEmpty() && busy.peek()[2]<=time) {
                    avail.offer(busy.poll());
                }
            }

            int server[]=avail.poll();
            ans[i]=server[1];
            server[2]=Math.max(i,server[2])+tasks[i];
            busy.add(server);
        }
        return ans;
    }
}