class Solution {
    public String reverseOnlyLetters(String s) {
        int i = 0, j = s.length()-1;
        char arr[] = s.toCharArray();
        while(i < j){
            while(i < s.length() && !Character.isLetter(s.charAt(i))){
                i++;
            }
            while(j >= 0 && !Character.isLetter(s.charAt(j))){
                j--;
            }
            if(i < j && i < s.length() && j >= 0){
                System.out.println("H");
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return new String(arr);
    }
}