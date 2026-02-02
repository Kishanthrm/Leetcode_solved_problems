class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2];
        for (int start = 0; start < nums.length - 2; start++) {
            if (start > 0 && nums[start] == nums[start - 1])
                ;
            int i = start + 1;
            int j = nums.length - 1;
            while (i < j) {
                int sum = nums[start] + nums[i] + nums[j];
                if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
                    closestSum = sum;
                }
                if (target == sum)
                    return sum;
                else if (sum > target)
                    j--;
                else if (sum < target)
                    i++;
            }
        }
        // System.out.print(list);
        return closestSum;
    }
}