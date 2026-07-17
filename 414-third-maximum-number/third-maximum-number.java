class Solution {
    public int thirdMax(int[] nums) {
        long max = Long.MIN_VALUE;
        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i] != max && nums[i] > max1)
                max1 = nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i] != max && nums[i] != max1 && nums[i] > max2)
                max2 = nums[i];
        }
        if(max2 == Long.MIN_VALUE){
            return (int)max;
        }
        else{
            return (int)max2;
        }
    }
}