class Solution {
    public boolean uniformArray(int[] nums1) {
        int minodd=Integer.MAX_VALUE;
        for(int x:nums1){
            if(x%2!=0){
                minodd=Math.min(x,minodd);
            }
        }
        for(int x:nums1){
            if(x%2==0 && minodd!=Integer.MAX_VALUE && x<minodd){
                return false;
            }
        }
        return true;
    }
}