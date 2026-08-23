class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        // ArrayList<Integer> res=new ArrayList<>();
        // for(int x:nums){
        //     res.add(x);
        // }
        // ArrayList<Integer> miss=new ArrayList<>();
        // for(int i=lower;i<=upper;i++){
        //     if(!res.contains(i)){
        //         miss.add(i);
        //     }
        // }
        // int k=0;
        // int i=0;
        // int j=1;
        // List<List<Integer>> ans=new ArrayList<>();
        // if(miss.size()==0) return ans;
        // while(j<miss.size()){
        //     if(miss.get(j)-miss.get(j-1)==1){
        //         j++;
        //     }else{
        //         List<Integer> temp=new ArrayList<>();
        //         temp.add(miss.get(i));
        //         temp.add(miss.get(j-1));
        //         ans.add(temp);
        //         i=j;
        //         j++;
               
        //     }
        // }
        //  List<Integer> temp=new ArrayList<>();
        //     temp.add(miss.get(i));
        //     temp.add(miss.get(j-1));
        //     ans.add(temp);
        // return ans;
        // 3 7 9
         List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        int i=lower;
        for(int j=0;j<nums.length;j++){
            int x=nums[j];
            if(x<lower){
                continue;
            }
            if(x>upper){
                break;
            }
            if(i<=x-1){
                List<Integer> temp=new ArrayList<>();
                temp.add(i);
                temp.add(x-1);
                ans.add(temp);
            }
            i=x+1;
        }
        if (i<=upper){
        List<Integer> temp=new ArrayList<>();
        temp.add(i);
        temp.add(upper);
        ans.add(temp);
        }
        
        return ans;

    }
}