class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr = s.trim().split("\\s+");
        // System.out.print(Arrays.toString(arr));
        String lastword = arr[arr.length-1];
        return lastword.length();
    }
}