class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map=new HashMap<>();
        int n=s.length();
        int left=0;
        int ans=0;
        int max=0;
        for(int right=0;right<n;right++){
            char ch=s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);
            max=Math.max(max,map.get(ch));

            while((right-left+1)-max>k){
                char l=s.charAt(left);
                map.put(l,map.get(l)-1);
                left++;
            }
            ans=Math.max(ans,right-left+1);
        }
        return ans;
        
    }
}

