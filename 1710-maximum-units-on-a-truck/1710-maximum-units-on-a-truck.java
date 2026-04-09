class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b)->b[1]-a[1]);
        int profit=0;
        int i=0;
        while(truckSize>0 && i < boxTypes.length){
            if(boxTypes[i][0]<=truckSize){
                profit+=boxTypes[i][0]*boxTypes[i][1];
                truckSize-=boxTypes[i][0];
                i++;
            }else{
                int box=boxTypes[i][0];
                int unit=boxTypes[i][1];
                profit=profit+truckSize*unit;
                truckSize-=truckSize;
                i++;
            }

        }
        return profit;
    }
}