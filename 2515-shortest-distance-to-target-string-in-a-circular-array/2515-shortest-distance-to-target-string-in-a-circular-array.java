class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n=words.length;
        if(words[startIndex].equals(target)) return 0;
        int min=Integer.MAX_VALUE;
        int x=startIndex+1;
        int step=1;
        while(step<n){
            int idx=x%n;
            if(words[idx].equals(target)){
                min=Math.min(step,min);
            }
            x++;
            step++;
        }
        int y=startIndex-1;
        step=1;
        while(step<n){
            if(y<0) y=n-1;
            if(words[y].equals(target)){
                min=Math.min(min,step);
            }
            step++;
            y--;
        }
        return min==Integer.MAX_VALUE?-1:min;
        
    }
}