class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<Integer> set=new HashSet<>();
        int max=0;
        for(int num:arr1){
            while(num>0){
                set.add(num);
                num=num/10;
            }
        }
        for(int num:arr2){
            while(num>0){
                if(set.contains(num)){
                    int length=String.valueOf(num).length();
                    max=Math.max(length,max);
                    break;
                }
                num=num/10;
            }
        }
        return max;
        
    }
}