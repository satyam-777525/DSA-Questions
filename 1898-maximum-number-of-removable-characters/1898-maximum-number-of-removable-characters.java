class Solution {
    public int maximumRemovals(String s, String p, int[] removable) {
        int n=removable.length;
        int l=0;
        int r=n;
        int ans=0;

        while(l<=r){
            int mid=l+(r-l)/2;

            if(helper(s,p,removable,mid)){
                ans=mid;
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return ans;
        
    }
    public static boolean helper(String s,String p,int []removable,int mid){
        boolean remove[]=new boolean[s.length()];
        for(int i=0;i<mid;i++){
            remove[removable[i]]=true;
        }
        int i=0;
        int j=0;
        while(i<s.length() && j<p.length()){
            if(!remove[i]&&s.charAt(i)==p.charAt(j)){
                j++;
            }
            i++;
        }
        return j==p.length();
    }
}