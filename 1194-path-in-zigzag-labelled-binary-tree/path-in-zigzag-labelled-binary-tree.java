class Solution {
    public List<Integer> pathInZigZagTree(int label) {
        List<Integer> arr = new ArrayList<>();
        int depth = 0;
        while(Math.pow(2,depth)<=label)depth++;
        depth--;
        int res = label;
        while(depth>=0){
            arr.add(res);
            int min = (int)Math.pow(2, depth);
            int max = (int)Math.pow(2, depth + 1) - 1;

            res = (min+max-res)/2;
            depth--;
        }
        Collections.reverse(arr);
        return arr;
    }
}