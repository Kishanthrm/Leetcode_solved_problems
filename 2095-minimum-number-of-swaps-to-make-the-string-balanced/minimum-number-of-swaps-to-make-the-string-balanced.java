class Solution {
    public int minSwaps(String s) {
        int min = Integer.MAX_VALUE, balance = 0;
        for(char ch : s.toCharArray()){
            if(ch == '[')balance++;
            else balance--;

            min = Math.min(min,balance);
        }
        return ((-1*min)+1)/2;
    }
}