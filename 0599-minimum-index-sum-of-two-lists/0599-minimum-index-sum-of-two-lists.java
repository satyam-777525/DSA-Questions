class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<list1.length;i++){
            map.put(list1[i],i);
        }
        ArrayList<String> list=new ArrayList<>();
        int minidx=Integer.MAX_VALUE;
        for(int i=0;i<list2.length;i++){
            if(map.containsKey(list2[i])){
                int idxsum=map.get(list2[i])+i;
                if(idxsum<minidx){
                    minidx=idxsum;
                    list.clear();
                    list.add(list2[i]);
                }
                else if(idxsum==minidx){
                    list.add(list2[i]);
                }
            }
        }
        return list.toArray(new String[0]);
    }
}