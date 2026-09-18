class Solution {
    public List<String> maxNumOfSubstrings(String s) {
        int n=s.length();
        int first[]=new int[26];
        int last[]=new int[26];
        Arrays.fill(first,-1);
        for(int i=0;i<s.length();i++){
            int x=s.charAt(i)-'a';
            if(first[x]==-1){
                first[x]=i;
            }
            last[x]=i;
        }
        List<int[]> intervals = new ArrayList<>();
        for(int i=0;i<n;i++){
            int x=s.charAt(i)-'a';
            if (first[x] != i) {
                continue;
            }
            int end=last[x];
            boolean valid=true;
            for(int j=i;j<=end;j++){
                int c=s.charAt(j)-'a';
                if(first[c]<i){
                    valid=false;
                    break;
                }
                end=Math.max(end,last[c]);
            }
            if(valid){
                intervals.add(new int[]{i,end});
            }
        }
        intervals.sort((a, b) -> Integer.compare(a[1], b[1]));

        List<String> ans = new ArrayList<>();

        int previousEnd = -1;
        for (int[] interval : intervals) {
            int start = interval[0];
            int end = interval[1];
            if (start > previousEnd) {
                ans.add(s.substring(start, end + 1));
                previousEnd = end;
            }
        }

        return ans;
        
    }
}