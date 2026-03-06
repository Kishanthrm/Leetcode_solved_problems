class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalCost = 0, totalGas = 0;
        for(int i=0;i<gas.length;i++){
            totalCost += cost[i];
            totalGas += gas[i];
        }
        if(totalCost > totalGas){
            return -1;
        }
        int currentGas = 0, start = 0;
        for(int i=0;i<gas.length;i++){
            currentGas += gas[i]-cost[i];
            if(currentGas < 0){
                start = i+1;
                currentGas = 0;
            }
        }
        return start;
    }
}