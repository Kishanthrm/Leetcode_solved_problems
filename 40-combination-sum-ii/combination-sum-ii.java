class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(candidates);
        int start = 0;
        int sum =0;
        backTracking(start, candidates, list, target,sum);
        return result;
    }

    public void backTracking(int start, int[] can, List<Integer> list,int tar,int sum){
        if(sum == tar){
            result.add(new ArrayList<>(list));
            return;
        }

        if(sum > tar) return;

        for(int i=start;i<can.length;i++){
            if (i > start && can[i] == can[i - 1]) continue;
            list.add(can[i]);
            sum += can[i];
            backTracking(i+1,can,list,tar,sum);
            list.remove(list.size()-1);
            sum -= can[i];
        }
    }
}