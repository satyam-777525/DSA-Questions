class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        for(int x:nums){
            set.add(x);
        }
        int multi=k;
        while(true){
            if(!set.contains(multi)){
                return multi;
            }
            multi+=k;
        }
    }
    
}