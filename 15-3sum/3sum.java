class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int size = nums.length;
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<size;i++){
            if(i != 0 && nums[i] == nums[i-1]) continue;
            int j = i+1, k = size-1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    list.add(temp);
                    j++;
                    k--;
                    while(j < k && nums[j] == nums[j-1])j++;
                    while(j < k && nums[k] == nums[k+1])k--;
                }
                else if(sum > 0){
                    k--;
                }
                else{
                    j++;
                }
            }
        }
        return list;
    }
}