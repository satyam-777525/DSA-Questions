class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totgas=0;
        int totcost=0;
        for(int i=0;i<gas.length;i++){
            totgas+=gas[i];
            totcost+=cost[i];
        }
        if(totgas<totcost){
            return -1;
        }
        int start=0;
        int currgas=0;
        for(int i=0;i<gas.length;i++){
            currgas+=(gas[i]-cost[i]);

            if(currgas<0){
                start=i+1;
                currgas=0;
            }
        }
        return start;
    }
}