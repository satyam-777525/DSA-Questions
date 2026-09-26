class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> map=new HashMap<>();
        for(List<String> k:knowledge){
            map.put(k.get(0),k.get(1));
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')'){
                q.add(i);
            }
        }
        int i=0;
        int n=s.length();
        String ans="";
        while(i<n){
            if(s.charAt(i)=='('){
                int j=q.poll();
                String t=s.substring(i+1,j);
                i+=t.length()+2;
                if(map.containsKey(t)){
                    ans+=map.get(t);
                }else{
                    ans+='?';
                }
            }else{
                ans+=s.charAt(i);
                i++;
            }
        }
        return ans;
    }
}