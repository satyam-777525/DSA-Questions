class Solution {
    public List<Integer> lastVisitedIntegers(int[] nums) {
        ArrayList<Integer> seen =new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        int n=nums.length;
        int k=0;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                seen.add(nums[i]);
                k=0;
            }
            if(nums[i]==-1){
                k++;
                if (k<=seen.size()) {
                    ans.add(seen.get(seen.size()-k));
                } else{
                    ans.add(-1);
                }
            }
        }
        return ans;
    }
}