class Solution {
    public String reverseVowels(String s) {
        String vowel = "aeiouAEIOU";
        StringBuilder sb = new StringBuilder(s);
        Stack<Character> st = new Stack<>();
        int i = 0,j = 0;
        while(i < s.length()){
            if(vowel.contains(s.charAt(i)+"")){
                st.push(s.charAt(i));
            }
            i++;
        }
        while(j < sb.length()){
            if(vowel.contains(sb.charAt(j)+"")){
                sb.setCharAt(j,st.pop());
            }
            j++;
        }
        return sb.toString();
    }
}