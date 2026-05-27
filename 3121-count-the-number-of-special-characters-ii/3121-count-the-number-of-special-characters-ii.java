class Solution {
    public int numberOfSpecialChars(String word) {
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(int i=0;i<word.length();i++){
            int ch=(int)word.charAt(i);
            if(ch>=97&&ch<=122){
               if(!map.containsKey(ch)){
                 map.put(ch,new ArrayList<>());
               }
               map.get(ch).add(i);
            }
        }
        int count=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<word.length();i++){
            int ch=(int) word.charAt(i);
            if(ch>=65&&ch<=90){
                int chota=ch+32;

                if (map.containsKey(chota) && !set.contains(chota)) {
                    ArrayList<Integer> list = map.get(chota);
                    int lastSmall = list.get(list.size() - 1);
                    int firstCap = i;

                    if(lastSmall<firstCap) {
                        count++;
                    }
                    set.add(chota);
                }
            }
        }
        return count;
    }
}