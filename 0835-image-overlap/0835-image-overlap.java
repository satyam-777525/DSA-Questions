class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n=img1.length;
        int ans=0;
        for(int dr=-(n-1);dr<=n-1;dr++){
            for(int dc=-(n-1);dc<=n-1;dc++){
                
                int count=0;
                for(int i=0;i<n;i++){
                    for(int j=0;j<n;j++){
                        int newr=i+dr;
                        int newc=j+dc;
                        if(img1[i][j]==1){
                            if(newr>=0&&newc>=0&&newr<n&&newc<n){
                                if(img2[newr][newc]==1){
                                    count++;
                                }
                            }
                        }
                    }
                }
                ans=Math.max(ans,count);
            }
        }
        return ans;
    }
}