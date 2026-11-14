class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        int count=0;
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<nums.size();i++){
            List<Integer> row=nums.get(i);
            for(int j=0;j<row.size();j++){
                int idx=i+j;
                if(list.size()<idx+1){
                    list.add(new ArrayList<>());
                }
                list.get(idx).add(row.get(j));
                count++;
            }
        }
        int ans[]=new int[count];
        int i=0;
        for(List<Integer> r:list){
            for(int j=r.size()-1;j>=0;j--){
                ans[i]=r.get(j);
                i++;
            }
        }
        return ans;
    }
}