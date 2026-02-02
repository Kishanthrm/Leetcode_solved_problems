class Solution {
    public boolean isHappy(int n) {
        HashMap<Integer,Integer> seen = new HashMap<>();

        while (n != 1) {
            if (seen.containsKey(n)) {
                return false;
            }
            seen.put(n,1);
            n = sqr(n);
        }
        return true;
    }

    int sqr(int n) {
        int res = 0;
        while (n != 0) {
            int rem = n % 10;
            res += (rem * rem);
            n = n / 10;
        }
        return res;
    }
}