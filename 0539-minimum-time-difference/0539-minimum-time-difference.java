class Solution {
    public int findMinDifference(List<String> timePoints) {
        int l=timePoints.size();
        int arr[]=new int[l];
        for(int i=0;i<l;i++){
            String s[]=timePoints.get(i).split(":");
           arr[i]=Integer.parseInt(s[0])*60+Integer.parseInt(s[1]);
        }
        Arrays.sort(arr);
        int ans=Integer.MAX_VALUE;
        for(int i=1;i<l;i++){
            ans=Math.min(ans,arr[i]-arr[i-1]);
        }
         // Circular difference
        ans = Math.min(ans, 1440 -arr[l-1]+arr[0]);

        return ans;
    }
}