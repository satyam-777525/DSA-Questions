class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
        int min=Integer.MAX_VALUE;
        min=Math.min(s1.length(),s2.length());
        min=Math.min(min,s3.length());
        String curr="";
        int count=0;
        for(int i=0;i<min;i++){
            if(s1.charAt(i)==s2.charAt(i)&&s2.charAt(i)==s3.charAt(i)){
                curr=curr+s1.charAt(i);
                count=Math.max(count,curr.length());
            }else{
                break;
            }
        }
        if(count==0) return -1;
        int ans=0;
        ans+=s1.length()-count;
        ans+=s2.length()-count;
        ans+=s3.length()-count;
        return ans;
        
        
    }
}