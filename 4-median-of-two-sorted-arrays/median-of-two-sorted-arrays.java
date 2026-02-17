class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<nums1.length;i++){
            list.add(nums1[i]);
        }
        for(int i = 0;i<nums2.length;i++){
            list.add(nums2[i]);
        }
        Collections.sort(list);
        int mid = list.size()/2;
        if(list.size()%2 == 0){
            return ((double)list.get(mid)+(double)list.get(mid-1))/2;
        }
        else{
            return list.get(mid);
        }
    }
}