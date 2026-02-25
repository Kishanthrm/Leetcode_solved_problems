class Solution {
    List<List<Integer>> list;
    int n;
    int k;
    public List<List<Integer>> combine(int n, int k) {
        this.n = n;
        this.k = k;
        list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        backTracking(1,temp);
        return list;
    }

    public void backTracking(int start, List<Integer> temp){
        if(temp.size() == k){
            list.add(new ArrayList<>(temp));
            return;
        }
        if(start > n) return;
        temp.add(start);
        backTracking(start+1,temp);
        temp.remove(temp.size()-1);
        backTracking(start+1,temp);
    }
}