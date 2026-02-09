class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) return false;

        HashMap<Character, Integer> s1map = new HashMap<>();
        HashMap<Character, Integer> s2map = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            s1map.put(s1.charAt(i), s1map.getOrDefault(s1.charAt(i), 0) + 1);
        }

        int i = 0;

        for (int j = 0; j < s2.length(); j++) {

            s2map.put(s2.charAt(j), s2map.getOrDefault(s2.charAt(j), 0) + 1);

            // keep window size equal to s1 length
            if (j - i + 1 > s1.length()) {
                char left = s2.charAt(i);
                s2map.put(left, s2map.get(left) - 1);
                if (s2map.get(left) == 0) {
                    s2map.remove(left);
                }
                i++;
            }

            // check permutation
            if (j - i + 1 == s1.length()) {
                if (s1map.equals(s2map)) {
                    return true;
                }
            }
        }
        return false;
    }
}
