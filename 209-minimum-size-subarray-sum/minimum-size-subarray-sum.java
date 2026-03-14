class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int size = nums.length, i = 0, j = 0, min = Integer.MAX_VALUE;
        int sum = 0;
        while(j < size){
            sum += nums[j];
            while(sum >= target){
                min = Math.min(min,j-i+1);
                sum -= nums[i];
                i++;
            }
            j++;
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}