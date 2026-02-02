class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for (int abs = 0; abs < nums.length - 3; abs++) {
            if (abs > 0 && nums[abs] == nums[abs - 1])
                    continue;
            for (int start = abs+1; start < nums.length - 2; start++) {
                if (start > abs+1 && nums[start] == nums[start - 1])
                    continue;
                int i = start + 1;
                int j = nums.length - 1;
                while (i < j) {
                    long sum =(long) nums[abs] + nums[start] + nums[i] + nums[j];
                    if (sum == target) {
                        List<Integer> inlist = new ArrayList<>();
                        inlist.add(nums[abs]);
                        inlist.add(nums[start]);
                        inlist.add(nums[i]);
                        inlist.add(nums[j]);
                        list.add(inlist);
                        i++;
                        j--;
                        while (i < j && nums[i] == nums[i - 1])
                            i++;
                        while (i < j && nums[j] == nums[j + 1])
                            j--;
                    } else if (sum > target) {
                        j--;
                    } else if (sum < target) {
                        i++;
                    }
                }
            }
        }
        return list;

    }
}