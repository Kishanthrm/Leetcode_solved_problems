class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i=0,j=0,max = 0,count=0;
        while(j < nums.length){
            while(j < nums.length && (nums[i] == 1 && nums[j] == 1)){
                count++;
                j++;
            }
            max = Math.max(count,max);
            count=0;
            while(j < nums.length && (nums[j] == 0)){
                j++;
            }
            i = j;
        }
        return max;
    }
}