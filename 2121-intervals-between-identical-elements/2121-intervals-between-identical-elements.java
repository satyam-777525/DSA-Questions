
class Solution {
    public long[] getDistances(int[] nums) {
        int n=nums.length;
        
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.computeIfAbsent(nums[i],k->new ArrayList<>()).add(i);
            
        }
        long ans[]=new long[n];
        for(ArrayList<Integer> list:map.values()){
            long sum=0;
            for(int x:list) sum+=x;
            long leftsum=0;
            int m=list.size();

            for(int i=0;i<m;i++){
                long rightsum=sum-leftsum-list.get(i);

                long left=(long) list.get(i)*i-leftsum;
                long right=rightsum-(long) list.get(i)*(m-i-1);

                ans[list.get(i)]=left+right;
                leftsum+=list.get(i);

            }
        }
        return ans;
    }
}