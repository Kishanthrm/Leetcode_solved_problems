class Solution {
    public boolean checkValidString(String s) {

        Stack<Integer> openst = new Stack<>();
        Stack<Integer> starst = new Stack<>();
        for (int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                openst.push(i);
            } else if (ch == '*') {
                starst.push(i);
            } else {
                if (!openst.isEmpty()) {
                    openst.pop();
                } else if (!starst.isEmpty()) {
                    starst.pop();
                } else {
                    return false;
                }
            }
        }
        while(!openst.isEmpty() && !starst.isEmpty()){
        if (openst.pop() > starst.pop()) {
            return false;
        }}
        return openst.isEmpty();
    }
}