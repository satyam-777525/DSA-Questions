class Solution {
    public int[] getStrongest(int[] arr, int k) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->{
            if(a[1]==b[1]){
                return Integer.compare(b[0],a[0]);
            }
            return Integer.compare(b[1],a[1]);
        });
        Arrays.sort(arr);
        int n=arr.length;
        int mid=arr[(n-1)/2];
        for(int x:arr){
            pq.add(new int[]{x,Math.abs(x-mid)});
        }
        int ans[]=new int[k];
        int i=0;
        while(k-->0){
            int curr[]=pq.poll();
            ans[i++]=curr[0];
        }
        return ans;
    }
}