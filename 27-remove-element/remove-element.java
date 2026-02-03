class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0,cnt = 0;
        if(nums.length == 1){
            if(nums[0] == val){
                return 0;
            }
            else{
                return 1;
            }
        }
        for(int k = 0;k<nums.length;k++){
            if(nums[k] == val){
                cnt++;
            }
        }
        for(int j = 1;j<nums.length;j++){
            if(nums[i] != val){
                i++;
            }
            else if(nums[i] != nums[j] && nums[i] == val){
                nums[i] = nums[j];
                nums[j] = val;
                i++;
            }
        }
        return nums.length-cnt;
    }
}