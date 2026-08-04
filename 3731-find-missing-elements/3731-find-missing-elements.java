class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        HashSet<Integer> set=new HashSet();
        for(int x:nums){
            set.add(x);
        }
        int min=Arrays.stream(nums).min().getAsInt();
        int max=Arrays.stream(nums).max().getAsInt();
        while(min<max){
            if(!set.contains(min)){
                ans.add(min);
            }
            min++;
        }
        return ans;
    }
}