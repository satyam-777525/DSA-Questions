class Solution {
    public int maximumLengthSubstring(String s) {
        int left=0;
        int maxlen=0;
        String res="";
        HashMap<Character,Integer> map=new HashMap<>();
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.get(ch)>2){
                char l=s.charAt(left);
                map.put(l,map.get(l)-1);
                if(map.get(l)==0){
                    map.remove(l);
                }
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;
        
    }
}
