class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int n=arr1.length;
        int arr[]=new int[n];
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int x:arr1){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int idx=0;
        for(int x:arr2){
            for(int i=0;i<map.get(x);i++){
                arr[idx++]=x;
            }
            map.remove(x);
        }
        while(!map.isEmpty()){
            int t=map.firstKey();
            for(int i=0;i<map.get(t);i++){
                arr[idx++]=t;
            }
            map.remove(t);
        }
        return arr;
        
    }
}