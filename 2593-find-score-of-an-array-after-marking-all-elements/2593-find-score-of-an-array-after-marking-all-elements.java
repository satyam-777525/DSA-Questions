
class Solution {
    public long findScore(int[] nums) {
        int n=nums.length;
        long ans=0;
        boolean visited[]=new boolean [n];
        int arr[][]=new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=nums[i];
            arr[i][1]=i;
        }
        Arrays.sort(arr,(a,b)->{
            if(a[0]!=b[0]){
                return a[0]-b[0];
            }
            return a[1]-b[1];
        });
        for(int i=0;i<arr.length;i++){
            int temp[]=arr[i];
            int val=temp[0];
            int idx=temp[1];
            if(visited[idx]==false){
                ans+=val;
                visited[idx]=true;
                if(idx-1>=0 && visited[idx-1]==false){
                    visited[idx-1]=true;
                }
                if( idx+1<n &&visited[idx+1]==false){
                    visited[idx+1]=true;
                }


            }
        }
        return ans;
        
    }
}
// 1+2+2
// [f,f,f,f,f,f]
// (1,3) (2,0) (2,5) (3,1) (3,4) (5,2)
// 2 3 5 1 3 2



