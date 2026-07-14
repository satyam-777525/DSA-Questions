class Solution {
    HashMap<Character,Integer> map;
    public boolean equalFrequency(String word) {
        map=new HashMap<>();
        for(char ch:word.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            map.put(ch,map.get(ch)-1);
            if(map.get(ch)==0){
                map.remove(ch);
            }
            if(solve()) return true;

            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        return false;
    }
    public boolean solve(){
      int x=-1;
      for(int i:map.values()){
        if(x==-1){
            x=i;
        }
        else if(x!=i){
            return false;
        }
      }
      return true;
    }
}

