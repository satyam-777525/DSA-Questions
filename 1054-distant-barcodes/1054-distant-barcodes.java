class Solution {
    public int[] rearrangeBarcodes(int[] barcodes) {
        int n=barcodes.length;
        int ans[]=new int[n];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:barcodes){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->b[1]-a[1]);
        for(int x:map.keySet()){
            pq.add(new int[]{x,map.get(x)});
        }
        int i=0;
        while(pq.size()>1){
            int a[]=pq.poll();
            int b[]=pq.poll();
            ans[i]=a[0];
            i++;
            ans[i]=b[0];
            i++;
            a[1]--;
            b[1]--;
            if(a[1]>0) pq.add(a);
            if(b[1]>0) pq.add(b);
        }
        if (!pq.isEmpty()) {
            ans[i] = pq.poll()[0];
        }
        return ans;

        
    }
}