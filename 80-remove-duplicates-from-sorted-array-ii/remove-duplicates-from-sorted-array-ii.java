class Solution {
    public int removeDuplicates(int[] arr) {
        int count = 1,o=1,prev = arr[0];
        for(int i=1;i<arr.length;i++){
            if(prev == arr[i]){
                count++;
            }
            else if((prev != arr[i])){
                prev = arr[i];
                count = 1;
            }
            if(count <= 2){
                arr[o++] = arr[i];
            }
        }
        return o;
    }
}