class Solution {
    public int minFlips(String target) {
        int n=target.length();
        char ch='0';
        int count=0;
        for(int i=0;i<n;i++){
            if(target.charAt(i)!=ch){
                count++;
                ch=target.charAt(i);
            }
        }
        return count;
    }
}