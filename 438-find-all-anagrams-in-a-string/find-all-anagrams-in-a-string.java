class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();
        if (s.length() < p.length()) return ans;

        HashMap<Character, Integer> pMap = new HashMap<>();
        HashMap<Character, Integer> sMap = new HashMap<>();

        // build frequency map for p
        for (char c : p.toCharArray()) {
            pMap.put(c, pMap.getOrDefault(c, 0) + 1);
        }

        int k = p.length();

        for (int i = 0; i < s.length(); i++) {
            // add current char to window
            char ch = s.charAt(i);
            sMap.put(ch, sMap.getOrDefault(ch, 0) + 1);

            // remove left char when window size exceeds k
            if (i >= k) {
                char left = s.charAt(i - k);
                if (sMap.get(left) == 1) sMap.remove(left);
                else sMap.put(left, sMap.get(left) - 1);
            }

            // compare maps
            if (sMap.equals(pMap)) {
                ans.add(i - k + 1);
            }
        }
        return ans;
    }
}
