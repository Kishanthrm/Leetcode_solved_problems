class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> s1map = new HashMap<>();
        HashMap<Character, Integer> s2map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            s1map.put(s1.charAt(i), s1map.getOrDefault(s1.charAt(i), 0) + 1);
        }
        int i = 0;
        for (int j = 0; j < s2.length(); j++) {
            s2map.put(s2.charAt(j), s2map.getOrDefault(s2.charAt(j), 0) + 1);
            while (s1.length() <= j-i+1) {
                if (s1map.equals(s2map)) {
                    return true;
                }
                s2map.put(s2.charAt(i), s2map.get(s2.charAt(i)) - 1);
                if (s2map.get(s2.charAt(i)) == 0) {
                    s2map.remove(s2.charAt(i));
                }
                i++;
            }
        }
        return false;
    }
}