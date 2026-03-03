class Solution {
    int []nums;
    List<List<Integer>> list;

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        this.nums = nums;
        Arrays.sort(nums);
        list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        backTracking(0,temp);
        return list;
    }

    public void backTracking(int index, List<Integer> temp){
        list.add(new ArrayList<>(temp));
        for(int i=index;i<nums.length;i++){
            if(i != index && nums[i] == nums[i-1])continue;
            temp.add(nums[i]);
            backTracking(i+1,temp);
            temp.remove(temp.size()-1);
        }
    }
}