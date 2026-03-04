class Solution {
    public int majorityElement(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        } else {
            Arrays.sort(nums);
            
                return nums[nums.length / 2];
            
        }
    }
}