class Solution {
    public int minMaxGame(int[] nums) {
        if(nums.length==1) return nums[0];
        ArrayList<Integer> res=new ArrayList<>();
        for(int x:nums) res.add(x);
        while(res.size()>1){
            ArrayList<Integer> list=new ArrayList<>();
            for(int i=0;i<res.size()/2;i++){
                int a=res.get(2*i);
                int b=res.get(2*i+1);
                if(i%2==0){
                    list.add(Math.min(a,b));
                }else{
                    list.add(Math.max(a,b));
                }
            }
            res=list;
        }
        return res.get(0);
        
    }
}