class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for(int start = 0;start<nums.length-2;start++){
            if (start > 0 && nums[start] == nums[start - 1]) continue;
            int i = start+1;
            int j = nums.length-1;
            while(i<j){
                if(nums[start] + nums[i]+nums[j] == 0){
                    List<Integer> inlist = new ArrayList<>();
                    inlist.add(nums[start]);
                    inlist.add(nums[i]);
                    inlist.add(nums[j]);
                    list.add(inlist);
                    i++;
                    j--;
                    while (i < j && nums[i] == nums[i - 1]) i++; 
                    while (i < j && nums[j] == nums[j + 1]) j--;
                }
                else if(nums[start] + nums[i]+nums[j] > 0){
                    j--;
                }
                else if(nums[start] + nums[i]+nums[j] <0){
                    i++;
                }
            }
        }
        return list;
    }
}