class pair{
    char ch;
    int count;
    pair(char ch,int count){
        this.ch=ch;
        this.count=count;
    }
}
class Solution {
    public String reorganizeString(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        PriorityQueue<pair> pq=new PriorityQueue<>((a,b)->b.count-a.count);
        for(char ch:map.keySet()){
            pq.add(new pair(ch,map.get(ch)));
        }
        StringBuilder sb=new StringBuilder();
        char prevchar='\0';
        int prevcount=0;
        while(!pq.isEmpty()){
            pair curr=pq.poll();
            char x=curr.ch;
            int y=curr.count;
            sb.append(x);
            if(prevcount>0){
                pq.add(new pair(prevchar,prevcount));
            }
            prevchar=x;
            prevcount=y-1;
        }
        if(sb.length()!=s.length()) return "";
        return sb.toString();
        
    }
}