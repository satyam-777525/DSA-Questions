class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int even=helper(arr,0);
        int odd=helper(arr,1);
        return Math.max(even,odd);
        
    }
    public static int helper(int arr[],int sign){
        int count=1;
        int max=1;
        for(int i=0;i<arr.length-1;i++){
            if(sign==0){
                if(i%2==0&& arr[i]>arr[i+1]){
                    count++;
                }else if(i%2!=0&&arr[i]<arr[i+1]){
                    count++;
                }else{
                    count=1;
                }
            }else{
                if(i%2==0&& arr[i]<arr[i+1]){
                    count++;
                }else if(i%2!=0&&arr[i]>arr[i+1]){
                    count++;
                }else{
                    count=1;
                }
            }
            max=Math.max(max,count);
        }
        return max;

    }
}