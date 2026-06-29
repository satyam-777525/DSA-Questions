class Solution {
    public int minimumRightShifts(List<Integer> nums) {
        int count=1;
        if(sort(nums)) return 0;
        for(int i=0;i<nums.size();i++){
            int x=nums.get(nums.size()-1);
            nums.remove(nums.size()-1);
            nums.add(0,x);
            if(sort(nums)){
                return count;
            }
            count++;
        }
        return -1;
    }
    public static boolean sort(List<Integer> res){
        List<Integer> ser=new ArrayList<>(res);
        Collections.sort(ser);
        return res.equals(ser);
    }
}
