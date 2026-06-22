class Solution {
    public int rearrangeCharacters(String s, String target) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int ans=0;
        boolean temp=false;
        while(!temp){
        for(char ch:target.toCharArray()){
            if(!map.containsKey(ch)||map.get(ch)==0){
                temp=true;
                return ans;
            }
            if(map.get(ch)>0){
                map.put(ch,map.get(ch)-1);
            }
            
        }
            if(temp==false){
                ans++;
            }else{
                return ans;
            }
        }
        return ans;
    }
}