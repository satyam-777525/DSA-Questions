class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long curr=mass;
        for(int i=0;i<asteroids.length;i++){
            if(curr>=asteroids[i]){
                curr+=asteroids[i];
            }else{
                return false;
            }
        }
        return true;
    }
}