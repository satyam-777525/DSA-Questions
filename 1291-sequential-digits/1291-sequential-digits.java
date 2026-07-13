class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String digit="123456789";
        List<Integer> res=new ArrayList<>();
        int lowlength=String.valueOf(low).length();
        int highlength=String.valueOf(high).length();
        for(int i=lowlength;i<=highlength;i++){
            for(int j=0;j<=digit.length()-i;j++){
                String subseq=digit.substring(j,j+i);
                int num=Integer.parseInt(subseq);

                if(num>=low && num<=high){
                    res.add(num);
                }
                if(num>high){
                    break;
                }
            }
        }
        return res;
        
    }
}