class Solution {
    public boolean isValidSerialization(String preorder) {
        int slot=1;
        String[] str=preorder.split(",");
        for(String s:str){
            if(slot==0){
                return false;
            }
            if(s.equals("#")){
                slot--;
            }
            else{
                slot--;
                slot=slot+2;
            }
        }
        return slot==0;
    }
}