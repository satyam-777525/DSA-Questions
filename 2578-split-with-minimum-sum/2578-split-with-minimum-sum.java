class Solution {
    public int splitNum(int num) {
        int x=0;
        int y=0;
        ArrayList<Integer> res=new ArrayList<>();
        while(num>0){
            res.add(num%10);
            num=num/10;
        }
        Collections.sort(res);
        for(int i=0;i<res.size();i=i+2){
            if(i<res.size()){
             x=x*10+res.get(i);
            }
            if(i+1<res.size()){
             y=y*10+res.get(i+1);
            }
        }
        return x+y;
    }
}