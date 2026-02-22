class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0"))
            return "0";
        int size1 = num1.length(), size2 = num2.length();
        int[] res = new int[size1 + size2];
        int mul = 1;
        for (int i = size1 - 1; i >= 0; i--) {
            int n1 = num1.charAt(i) - '0';
            for (int j = size2 - 1; j >= 0; j--) {
                int n2 = num2.charAt(j) - '0';

                mul = n1 * n2;
                int poshigh = i + j + 1;
                int poslow = i + j;

                mul += res[poshigh];

                res[poshigh] = mul % 10;
                res[poslow] += mul / 10;
            }
        }
        StringBuilder ans = new StringBuilder();

        for (int num : res) {
            if (!(ans.length() == 0 && num == 0)) {
                ans.append(num);
            }
        }
        return ans.toString();
    }
}