class Solution {
    public String oddString(String[] words) {
        HashMap<ArrayList<Integer>,Integer> map=new HashMap<>();
        HashMap<ArrayList<Integer>,String> map1=new HashMap<>();
        for(String s:words){
            ArrayList<Integer> res=new ArrayList<>();
            int n=s.length();
            for(int i=0;i<n-1;i++){
                int x=s.charAt(i)-'a';
                int y=s.charAt(i+1)-'a';
                res.add(y-x);
            }
            map.put(res,map.getOrDefault(res,0)+1);
            map1.put(res,s);
        }
        for(ArrayList<Integer> res:map.keySet()){
            if(map.get(res)==1){
                return map1.get(res);
            }
        }
        return "";
        
    }
}