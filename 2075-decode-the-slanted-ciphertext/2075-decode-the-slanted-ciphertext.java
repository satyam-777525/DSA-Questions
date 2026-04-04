class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        int cols=encodedText.length()/rows;
        char ch[][]=new char[rows][cols];
        int k=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(k<encodedText.length()){
                    ch[i][j]=encodedText.charAt(k);
                    k++;
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int st=0;st<cols;st++){
            int i=0;
            int j=st;
            while(i<rows && j<cols){
                sb.append(ch[i][j]);
                i++;
                j++;
            }
        }
        String s=sb.toString().stripTrailing();
        return s;

        
    }
}