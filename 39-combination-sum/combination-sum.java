class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] can, int tar) {
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        backTracking(0,list,tar,can,sum);
        return result;
    }
    
    public void backTracking(int start,List<Integer> list, int tar, int[] can,int sum){
        if(sum == tar){
            result.add(new ArrayList<>(list));
            return;
        }

        if(sum > tar) return;

        for(int i=start;i<can.length;i++){
            list.add(can[i]);
            sum+=can[i];
            backTracking(i,list,tar,can,sum);
            int removed = list.remove(list.size()-1);
            sum-=removed;
        }
    }
}