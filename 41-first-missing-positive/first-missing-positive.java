class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int size = nums.length;
        int num = 0, i = 0;
        while(i < size){
            if(nums[i] <= 0){
                i++;
            }
            else if(i != 0 && nums[i] == nums[i-1]){
                i++;
            }
            else if(++num != nums[i]){
                return num;
            }
            else{
                i++;
            }
        }
        return ++num;
    }
}