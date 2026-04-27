class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans=new ArrayList<>();
        ans.add(new ArrayList<>());
        ans.add(new ArrayList<>());
        HashSet<Integer> first=new HashSet<>();
        HashSet<Integer> secound=new HashSet<>();
        for(int x:nums1){
            first.add(x);
        }
        for(int x:nums2){
            secound.add(x);
        }
        for(int x:first){
            if(!secound.contains(x)){
                ans.get(0).add(x);
            }
        }
        for(int x:secound){
            if(!first.contains(x)){
                ans.get(1).add(x);
            }
        }
        return ans;

        
    }
}