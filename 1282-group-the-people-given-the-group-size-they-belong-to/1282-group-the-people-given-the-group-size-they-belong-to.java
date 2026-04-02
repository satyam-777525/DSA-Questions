class Solution {
    public List<List<Integer>> groupThePeople(int[] arr) {
        List<List<Integer>> ans=new ArrayList<>();
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],new ArrayList<>());
            }
            map.get(arr[i]).add(i);
        }
        for(int y:map.keySet()){
            ArrayList<Integer> res=map.get(y);
            int size=res.size()/y;
            while(size-->0){
                List<Integer> z=new ArrayList<>();
                for(int i=0;i<y;i++){
                    z.add(res.get(0));
                    res.remove(0);
                }
                ans.add(z);
            }

        }
        return ans;
       
    }
}


