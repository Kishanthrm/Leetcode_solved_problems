class Solution {
    public int[][] intervalIntersection(int[][] arr, int[][] mat) {
        int i=0,j=0;
        List<int[]> list = new ArrayList<>();
        while(i < arr.length && j < mat.length){
            int start = Math.max(arr[i][0],mat[j][0]);
            int end = Math.min(arr[i][1],mat[j][1]);

            if(start <= end){
                list.add(new int[]{start,end});
            }

            if(arr[i][1] < mat[j][1]){
                i++;
            }
            else{
                j++;
            }
        }
        return list.toArray(new int[list.size()][2]);
    }
}