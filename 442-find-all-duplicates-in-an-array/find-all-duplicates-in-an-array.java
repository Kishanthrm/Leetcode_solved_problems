class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int i = 1, size = nums.length;
        while(i < size){
            if(nums[i] == nums[i-1]){
                list.add(nums[i]);
            }
            i++;
        }
        return list;
    }
}