class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> set=new HashSet<>();
        for(char ch:word.toCharArray()){
            set.add(ch);
        }
        int count=0;
        for(char x:set){ 
            if((int)x>=97){
                char upper=(char)(x-32);
                if(set.contains(upper)){
                    count++;
                }
            }
        }
        return count;
    }
}