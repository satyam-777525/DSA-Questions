class Solution {
    public int[] platesBetweenCandles(String s, int[][] queries) {
        int n=s.length();
        int plate[]=new int[n+1];
        plate[0]=0;
        for(int i=1;i<=n;i++){
            if(s.charAt(i-1)=='*'){
                plate[i]=plate[i-1]+1;
            }else{
                plate[i]=plate[i-1];
            }
        } 
        int []left=new int[n];
        int last=-1;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='|'){
                last=i;
            }
            left[i]=last;
        }

        int[]right=new int[n];
         last=-1;
        for(int i= n-1;i>=0;i--){
            if(s.charAt(i)=='|'){
                last=i;
            }
            right[i]=last;
        }

        int m=queries.length;
        int ans[]=new int[m];
        int i=0;
        for(int q[]:queries){
            int x=q[0];
            int y=q[1];
            int l=right[x];
            int r=left[y];

            if(l!=-1 && r!=-1&& l<r){
                ans[i]=plate[r]-plate[l];
            }else{
                ans[i]=0;
            }
            i++;
        }
        return ans;
    }
}