class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i = 0,j = k-1;
        double sum = 0;
        for(int l = 0;l < k;l++)sum+=nums[l];
        double max = sum/k;
        while(j < nums.length){
            i++;
            j++;
            if(j < nums.length)sum = ((sum - nums[i-1])+nums[j]);
            max = Math.max(sum/k,max);
        }
        return max;
    }
}