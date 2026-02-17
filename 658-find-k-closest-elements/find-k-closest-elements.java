class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int mid = binarySearch(arr,x);
        // System.out.print(mid);
        List<Integer> list = new ArrayList<>();
        int i = mid-1, j = mid;
        while((i >= 0 && j < arr.length) && k != list.size()){
            if(Math.abs(arr[i]-x) <= Math.abs(arr[j]-x)){
                list.add(arr[i]);
                i--;
            }
            else if(Math.abs(arr[i]-x) > Math.abs(arr[j]-x)){
                list.add(arr[j]);
                j++;
            }
        } 
        while(list.size() < k){
            if(i >= 0){
                list.add(arr[i]);
                i--;
            }
            else{
                list.add(arr[j]);
                j++;
            }
        }
        Collections.sort(list);
        return list;
    }

    int binarySearch(int[] arr, int x){
        int low = 0, high  = arr.length-1;

        while(low <= high){
            int mid = low+(high-low)/2;

            if(arr[mid] == x)return mid;
            else if(arr[mid] > x){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
}