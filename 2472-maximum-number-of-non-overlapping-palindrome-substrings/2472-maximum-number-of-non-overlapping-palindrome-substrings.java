class Solution {
    public int maxPalindromes(String s, int k) {
        int n=s.length();
        if(k==1) return n;

        int ans=0;
        for(int i=0;i<=n-k;i++){
            if(helper(i,i+k-1,s)){
                ans++;
                i+=k-1;
            }
            else if(i<n-k&&helper(i,i+k,s)){
                ans++;
                i+=k;
            }
        }
        return ans;
    }
    public boolean helper(int l,int r,String s){
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}