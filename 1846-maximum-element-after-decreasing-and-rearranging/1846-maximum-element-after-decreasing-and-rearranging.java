class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        if(arr[0]!=1){
            arr[0]=1;
        }
        for(int i=0;i<arr.length-1;i++){
            if(Math.abs(arr[i+1]-arr[i])>1){
                arr[i+1]=arr[i]+1;
            }
        }
        int max=Integer.MIN_VALUE;
        for(int x:arr){
            max=Math.max(max,x);
        }
        return max;

        
    }
}
// 1 1 2 2 2
// 1 2 3
// 1 1 2 3 6
//1 100 1000