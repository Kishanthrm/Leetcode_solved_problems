class Solution {
    int[] arr;
    List<List<Integer>> list;
    int target, n;

    public List<List<Integer>> combinationSum(int[] arr, int target) {
        this.arr = arr;
        this.target = target;
        n = arr.length;
        list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        backTracking(0, temp, 0);
        return list;
    }

    public void backTracking(int index, List<Integer> temp, int sum) {
        if (sum == target) {
            list.add(new ArrayList<>(temp));
            return;
        }
        if(index == n || sum > target){
            return;
        }

        temp.add(arr[index]);
        sum += arr[index];
        backTracking(index, temp, sum);
        temp.remove(temp.size() - 1);
        sum -= arr[index];
        backTracking(index + 1, temp, sum);
    }
}