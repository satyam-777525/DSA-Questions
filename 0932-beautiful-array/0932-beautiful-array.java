class Solution {
    public int[] beautifulArray(int n) {
        ArrayList<Integer> res=new ArrayList<>();
        res.add(1);

        while(res.size()<n){
            ArrayList<Integer> temp=new ArrayList<>();
            for(int x:res){
                int val=2*x-1;
                if(val<=n){
                    temp.add(val);
                }
            }
            for(int x:res){
                int val=2*x;
                if(val<=n){
                    temp.add(val);
                }
            }
            res=temp;
        }
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=res.get(i);
        }
        return ans;
    }
}