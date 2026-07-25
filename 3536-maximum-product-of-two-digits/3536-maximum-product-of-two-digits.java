class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> res=new ArrayList<>();
        while(n>0){
            res.add(n%10);
            n=n/10;
        }
        Collections.sort(res);
        int l=res.size();
        return res.get(l-1)*res.get(l-2);
        
    }
}