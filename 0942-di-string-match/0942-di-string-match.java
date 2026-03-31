class Solution {
    public int[] diStringMatch(String s) {
        int n=s.length();
        int ans[]=new int[n+1];
        int i=0;
        int j=n;
        
        for(int k=0;k<n;k++){
            if(s.charAt(k)=='I'){
                ans[k]=i++;
            }else{
                ans[k]=j--;
            }
        }
        ans[n]=i;
        return ans;
    }
}