class Solution {
    List<List<Integer>> list;
    int []nums;
    int n;
    public List<List<Integer>> permute(int[] nums) {
        this.nums = nums;
        n = nums.length;
        list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean[] visited = new boolean[n];
        backTracking(temp,visited);
        return list;
    }

    public void backTracking (List<Integer> temp, boolean[] visited){
        if(temp.size() == n){
            list.add(new ArrayList<>(temp));
        }
        for(int i=0;i<n;i++){
            if(visited[i])continue;
            temp.add(nums[i]);
            visited[i] = true;
            backTracking(temp,visited);
            temp.remove(temp.size()-1);
            visited[i] = false;
        }
    }
}