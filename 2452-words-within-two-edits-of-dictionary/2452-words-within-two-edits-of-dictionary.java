class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> list=new ArrayList<>();
        for(String q:queries){
            for(String d:dictionary){
                int edit=count(q,d);
                if(edit<=2){
                    list.add(q);
                    break;
                } 
            }
        }
        return list;
        
    }
    public int count(String a,String b){
        int n=a.length();
        int count=0;
        for(int i=0;i<n;i++){
            if(a.charAt(i)!=b.charAt(i)){
                count++;
            }
        }
        return count;
    }
}