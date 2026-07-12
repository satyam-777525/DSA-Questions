class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int ans[]=new int[arr.length];
        int temp[]=arr.clone();
        Arrays.sort(temp);
        HashMap<Integer,Integer> map=new HashMap<>();
        int rank=1;
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(temp[i])){
                map.put(temp[i],rank++);
            }
        }
        for(int i=0;i<arr.length;i++){
            ans[i]=map.get(arr[i]);
        }
        return ans;


        
    }
}