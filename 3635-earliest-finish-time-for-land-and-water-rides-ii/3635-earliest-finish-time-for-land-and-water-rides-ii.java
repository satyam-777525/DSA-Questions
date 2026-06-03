class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
       int minland=Integer.MAX_VALUE;
       int minwater=Integer.MAX_VALUE;

       int ans=Integer.MAX_VALUE;

       for(int i=0;i<landStartTime.length;i++){
        minland=Math.min(minland,landStartTime[i]+landDuration[i]);
       }
       for(int i=0;i<waterStartTime.length;i++){
        int curr=Math.max(minland,waterStartTime[i])+waterDuration[i];
        ans=Math.min(ans,curr);

       }

       for(int i=0;i<waterStartTime.length;i++){
        minwater=Math.min(minwater,waterStartTime[i]+waterDuration[i]);
       }
       for(int i=0;i<landStartTime.length;i++){
        int curr=Math.max(minwater,landStartTime[i])+landDuration[i];
        ans=Math.min(ans,curr);

       }
       return ans;
    }
}