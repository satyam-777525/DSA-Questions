class Solution {
    public String smallestPalindrome(String s) {
        if(s.length()==1) return s;
        int n=s.length();
        TreeMap<Character,Integer> map=new TreeMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        char ch[]=new char[n];
        int left=0;
        int right=n-1;
        char middle=' ';

        for(char c:map.keySet()){
            int count=map.get(c);

            while(count>=2){
                ch[left]=c;
                ch[right]=c;
                left++;
                right--;
                count-=2;
            }
            if(count==1){
                middle=c;
            }
        }
        if(middle!=' '){
            ch[left]=middle;
        }
       
        return new String(ch);
    }
}