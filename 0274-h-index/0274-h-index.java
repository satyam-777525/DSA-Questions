class Solution {
    public int hIndex(int[] citations) {
        int n=citations.length;
        Arrays.sort(citations);
        for(int i=0;i<n;i++){
            int idx=n-i;
            if(citations[i]>=idx){
                return idx;
            }
        }
        return 0;
    }
}
