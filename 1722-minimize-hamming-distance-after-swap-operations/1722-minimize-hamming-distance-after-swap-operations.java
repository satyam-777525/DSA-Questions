class DSU{
    int parent[];
    DSU(int n){
        parent=new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;
        }
        
    }
    int find(int x){
            if(parent[x]==x) return x;
            return parent[x]=find(parent[x]);
        }
        void union(int a,int b){
            int p1=find(a);
            int p2=find(b);
            if(p1!=p2){
                parent[p1]=p2;
            }
        }
}
class Solution {
    public int minimumHammingDistance(int[] source, int[] target, int[][] allowedSwaps) {
        int n=source.length;
        DSU dsu=new DSU(n);
        for(int []swap:allowedSwaps){
            dsu.union(swap[0],swap[1]);
        }

        HashMap<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int root=dsu.find(i);
            map.putIfAbsent(root,new ArrayList<>());
            map.get(root).add(i);
        }
        int ans=0;
        for(List<Integer> idx:map.values()){
            HashMap<Integer,Integer> freq=new HashMap<>();
            for(int i:idx){
                freq.put(source[i],freq.getOrDefault(source[i],0)+1);
            }
            for(int i:idx){
                int val=target[i];
                if(freq.getOrDefault(val,0)>0){
                    freq.put(val,freq.get(val)-1);
                }else{
                    ans++;
                }
            }
        }
        return ans;
        
    }
}