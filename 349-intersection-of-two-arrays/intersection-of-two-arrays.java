class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        HashMap<Integer,Integer> map = new HashMap<>(); 
        ArrayList<Integer> ans = new ArrayList<>();
        for(int a : nums1){
            set1.add(a);
        }
        for(int a : nums2){
            set2.add(a);
        }
        for(int a : set1){
            map.put(a,1);
        }
        for(int a : set2){
            if(map.containsKey(a)) ans.add(a);
        }
        int[] arr = new int[ans.size()];

        for(int i = 0;i<ans.size();i++){
            arr[i] = ans.get(i);
        }
        return arr;
    }
}