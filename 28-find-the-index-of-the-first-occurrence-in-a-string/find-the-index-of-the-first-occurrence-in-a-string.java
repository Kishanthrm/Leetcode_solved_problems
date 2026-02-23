class Solution {

    public int[] findLPS(String s) {
        int[] lps = new int[s.length()];
        int len = 0;
        int i = 1;

        while (i < s.length()) {
            if (s.charAt(i) == s.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;

        int[] lps = findLPS(needle);

        int i = 0; // haystack pointer
        int j = 0; // needle pointer

        while (i < haystack.length()) {

            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            }

            if (j == needle.length()) {
                return i - j;  // match found
            } 
            else if (i < haystack.length() && haystack.charAt(i) != needle.charAt(j)) {
                if (j != 0) {
                    j = lps[j - 1];  // jump using LPS
                } else {
                    i++;
                }
            }
        }
        return -1;
    }
}