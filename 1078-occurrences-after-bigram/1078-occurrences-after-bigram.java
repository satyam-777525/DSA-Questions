class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String ch[]=text.split(" ");
        ArrayList<String> res=new ArrayList<>();
        for(int i=0;i<ch.length-2;i++){
            if(ch[i].equals(first) && ch[i+1].equals(second)){
                res.add(ch[i+2]);
            }
        }
        String ans[]=new String[res.size()];
        int i=0;
        for(String s:res){
            ans[i]=s;
            i++;
        }
        return ans;
    }
}