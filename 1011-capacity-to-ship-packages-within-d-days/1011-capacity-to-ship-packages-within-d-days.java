class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        for(int x:weights){
            low=Math.max(low,x);
            high+=x;
        }
        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(fun(weights,days,mid)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public boolean fun(int weights[],int days,int limit){
        int day=1;
        int curr=0;
        
        for(int x:weights){
            if(curr+x>limit){
                curr=0;
                day++;
            }
            curr+=x;
        }
        return day<=days;
    }
}