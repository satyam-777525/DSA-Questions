class Solution {
    public void duplicateZeros(int[] arr) {
        int temp[]=arr.clone();
        int i=0;
        int j=0;
        while(j<arr.length){
            if(temp[i]!=0){
                arr[j]=temp[i];
                j++;
            }
            if(temp[i]==0){
                if(j<arr.length){
                    arr[j]=0;
                    j++;
                }
                if(j<arr.length){
                    arr[j]=0;
                    j++;
                }
            }
            i++;
        }
        
        
    }
}