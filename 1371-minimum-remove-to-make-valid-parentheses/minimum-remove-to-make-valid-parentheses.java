class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> open = new Stack<>();
        Stack<Integer> close = new Stack<>();
        char[] ch = new char[s.length()];
        Arrays.fill(ch, '0');
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                ch[i] = c;
            } else {
                if (c == '(') {
                    open.push(i);
                } else {
                    if (open.isEmpty()) {
                        close.push(i);
                    } else {
                        ch[i] = ')';
                        ch[open.pop()] = '(';
                    }
                }
            }
        }
        StringBuilder str = new StringBuilder();
        for (char i : ch) {
            if (i != '0') {
                str.append(i);
            }
        }
        return str.toString();

    }
}