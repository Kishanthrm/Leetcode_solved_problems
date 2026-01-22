class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int start = 0;
        backTracking(start, nums, list);
        return result;
    }

    public void backTracking(int start, int[] nums, List<Integer> list){
        
            result.add(new ArrayList<>(list));
        

        for(int i = start;i<nums.length;i++){
            list.add(nums[i]);
            backTracking(i+1,nums,list);
            list.remove(list.size()-1);
        }
    } 
}