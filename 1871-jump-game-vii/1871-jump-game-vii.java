class Solution {
    public boolean canReach(String s, int minjump, int maxjump) {
        int n=s.length();
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        boolean[] vis=new boolean[n];
        vis[0]=true;
        int further=0;
        while(!q.isEmpty()){
            int idx=q.poll();
            if(idx==n-1) return true;

            int l=Math.max(further+1,idx+minjump);
            int r=Math.min(idx+maxjump,n-1);
            for(int k=l;k<=r;k++){
                if(s.charAt(k)=='0' && vis[k]==false){
                    vis[k]=true;
                    q.add(k);
                }
            }
            further=Math.max(further,r);
        }
        return false;
    }
}