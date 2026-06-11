class Solution {
     int mod = 1000000007;
    public int assignEdgeWeights(int[][] edges) {
       
        int n=edges.length+1;
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        for(int[]e:edges){
            int s=e[0];
            int d=e[1];
            map.putIfAbsent(s,new ArrayList<>());
            map.putIfAbsent(d,new ArrayList<>());
            map.get(s).add(d);
            map.get(d).add(s);
        }
        Queue<Integer> q=new LinkedList<>();
        HashSet<Integer> set=new HashSet<>();
        q.add(1);
        set.add(1);
        int depth=-1;
        while(!q.isEmpty()){
            depth++;
            int size=q.size();
            for(int i=0;i<size;i++){
                int curr=q.remove();
                List<Integer> res=map.get(curr);
                if(res==null) continue;
                for(int next:res){
                    if(set.contains(next)) continue;
                    q.add(next);
                    set.add(next);
                }
            }
        }
        return power(2,depth-1);
        
    }

     // Fast binary exponentiation under mod
    int power(int base, int exp) {
        long res=1;
        long b=base % mod;

        while (exp> 0) {
            if ((exp & 1) == 1)             // If current bit is set, multiply result
                res = (res * b % mod) % mod;
            b = b * b % mod;                // Square the base
            exp = exp >> 1;                 // Shift to next bit
        }

        return (int) res;
    }
}