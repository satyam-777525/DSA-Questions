class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n=baskets.length;
        boolean visited[]=new boolean[n];
        int count=0;
        for(int i=0;i<n;i++){
            boolean temp=false;
            for(int j=0;j<n;j++){
                if(fruits[i]<=baskets[j]&& !visited[j]){
                    visited[j]=true;
                    temp=true;
                    break;
                }
            }
            if(!temp){
                count++;
            }
        }
        return count;
    }
}