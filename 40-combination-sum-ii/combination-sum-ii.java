class Solution {
    List<List<Integer>> list;
    int n;
    int[] arr;
    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        this.arr = arr;
        this.n = arr.length;
        list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(arr);
        backTracking(0,target,temp);
        return list;
    }

    public void backTracking(int index, int target, List<Integer> temp){
        if(target == 0){
            list.add(new ArrayList<>(temp));
            return;
        }
        for(int i = index;i<n;i++){
            if(i > index && arr[i] == arr[i-1]){
                continue;
            }
            if(target < arr[i]){
                break;
            }
            temp.add(arr[i]);
            backTracking(i+1,target-arr[i],temp);
            temp.remove(temp.size()-1);
        }
    }
}