class Solution {
    public int compress(char[] chars) {
        int write = 0; // where to write next
        int i = 0;     // read pointer

        while (i < chars.length) {
            char current = chars[i];
            int count = 0;

            // count how many times current repeats
            while (i < chars.length && chars[i] == current) {
                i++;
                count++;
            }

            // write the character
            chars[write++] = current;

            // write the count if greater than 1
            if (count > 1) {
                String s = String.valueOf(count);
                for (char c : s.toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        // write is now the new length
        return write;
    }
}
