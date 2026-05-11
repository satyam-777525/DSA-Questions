class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> res=new ArrayList<>();
        int n=nums.length;
        for(int i=n-1;i>=0;i--){
            int x=nums[i];
            while(x>0){
                int d=x%10;
                res.add(0,d);
                x=x/10;
            }
        }
        int l=res.size();
        int ans[]=new int[l];
        for(int i=0;i<l;i++){
            ans[i]=res.get(i);
        }
        return ans;
    }
}