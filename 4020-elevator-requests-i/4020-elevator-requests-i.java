class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int count=0;
        int time=0;
        for(int x:requests){
            int y=Math.abs(time-x);
            time=x;
            count+=y;
        }
        return count;
    }
}