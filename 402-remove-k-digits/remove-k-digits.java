class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);

            while (!st.isEmpty() && (st.peek() - '0') > (ch - '0') && k > 0) {
                st.pop();
                k--;
            }
            st.push(ch);
        }

        while (k > 0) {
            st.pop();
            k--;
        }

        StringBuilder str = new StringBuilder();
        while (!st.isEmpty()) {
            str.append(st.pop());
        }
        str.reverse();

        while (str.length() > 1 && str.charAt(0) == '0') {
            str.deleteCharAt(0);
        }

        return str.length() == 0 ? "0" : str.toString();
    }
}