class Solution {
    List<List<Integer>> list;
    int[] nums;
    int n;
    public List<List<Integer>> subsets(int[] nums) {
        list = new ArrayList<>();
        this.nums = nums;
        n = nums.length;
        List<Integer> tmp = new ArrayList<>();
        backTracking(0,tmp);
        return list;
    }

    public void backTracking(int index, List<Integer> tmp){
        if(index == n){
            list.add(new ArrayList<>(tmp));
            return;
        }
        tmp.add(nums[index]);
        backTracking(index+1, tmp);
        tmp.remove(tmp.size()-1);
        backTracking(index+1, tmp);
    }
}