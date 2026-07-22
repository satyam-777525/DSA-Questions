class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int n=firstList.length;
        int m=secondList.length;
        ArrayList<int[]> res=new ArrayList<>();
        int i=0;
        int j=0;
        int stmin=0;
        int edmin=0;
        while(i<n &&j<m){
            stmin=Math.max(firstList[i][0],secondList[j][0]);
            edmin=Math.min(firstList[i][1],secondList[j][1]);

            if(edmin>=stmin){
                res.add(new int[]{stmin,edmin});
            }
            if(edmin>=firstList[i][1]) i++;
            if(edmin>=secondList[j][1])j++;
        }
        int x=res.size();
        int ans[][]=new int[x][2];
        int k=0;
        for(int a[]:res){
            ans[k]=a;
            k++;
        }
        return ans;
    }
}
