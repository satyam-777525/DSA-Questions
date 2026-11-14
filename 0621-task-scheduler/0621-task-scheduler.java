class Solution {
    public int leastInterval(char[] tasks, int n) {
        int freq[]=new int[26];
        for(char ch:tasks){
            freq[ch-'A']++;
        }
        int maxfreq=0;
        for(int x:freq){
            maxfreq=Math.max(x,maxfreq);
        }
        int maxcount=0;
        for(int x:freq){
            if(x==maxfreq){
                maxcount++;
            }
        }
        int ans=(maxfreq-1)*(n+1)+maxcount;
        return Math.max(tasks.length,ans);
    }
}