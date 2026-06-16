class Solution {
    public String processStr(String s) {
        StringBuilder res=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(Character.isLetter(ch)){
                res.append(ch);
            }
            if(ch=='*'){
                if(res.length()>0){
                res.deleteCharAt(res.length()-1);
                }
            }
            if(ch=='#'){
                StringBuilder sb=new StringBuilder(res);
                res.append(sb);
            }
            if(ch=='%'){
               res.reverse(); 
            }
        }
        return res.toString();

        
    }
}