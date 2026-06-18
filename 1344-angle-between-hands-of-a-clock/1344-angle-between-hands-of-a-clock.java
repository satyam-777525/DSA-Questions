class Solution {
    public double angleClock(int hour, int minutes) {
        double ans=Math.abs((hour*30)-(5.5*minutes));
        return (ans>180)?(360-ans):ans;
    }
}