class Solution {
    public String[] findWords(String[] words) {
        ArrayList<String> res=new ArrayList<>();
        String row1="qwertyuiop";
        String row2="asdfghjkl";
        String row3="zxcvbnm";
        for(String s:words){
            char[]x=s.toLowerCase().toCharArray();
            boolean temp=true;
            for(char ch:x){
                if(!row1.contains(""+ch)){
                    temp=false;
                    break;
                }
            }
            if(temp){
                res.add(s);
                continue;
            }
            boolean temp1=true;
            for(char ch:x){
                if(!row2.contains(""+ch)){
                    temp1=false;
                    break;
                }
            }
            if(temp1){
                res.add(s);
                continue;
            }
            boolean temp2=true;
            for(char ch:x){
                if(!row3.contains(""+ch)){
                    temp2=false;
                    break;
                }
            }
            if(temp2){
                res.add(s);
                continue;
            }
        }
        String ans[]=new String[res.size()];
        for(int i=0;i<res.size();i++){
            ans[i]=res.get(i);
        }
        return ans;

        
    }
}