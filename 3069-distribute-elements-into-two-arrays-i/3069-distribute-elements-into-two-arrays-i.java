class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        for(int x:nums){
            if(arr1.size()==0){
                arr1.add(x);
                continue;
            }
            if(arr2.size()==0){
                arr2.add(x);
                continue;
            }
            if(arr1.get(arr1.size()-1)>arr2.get(arr2.size()-1)){
                arr1.add(x);
                continue;
            }else{
                arr2.add(x);
            }
        }
        int j=0;
        
        for(int i=0;i<arr1.size();i++){
            nums[j++]=arr1.get(i);
        }
        for(int i=0;i<arr2.size();i++){
            nums[j++]=arr2.get(i);
        }

        return nums;
    }
}