class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] arr = new int[128];
        int size = s.length(), i = 0, j = 0, max = 0;
        while(j < size){
            char ch = s.charAt(j);
            arr[ch]++;
            while(arr[ch] > 1){
                arr[s.charAt(i)]--;
                i++;
            }
            max = Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}