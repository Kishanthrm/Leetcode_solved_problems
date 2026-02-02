class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();

        while (n != 1) {
            if (seen.contains(n)) {
                return false;
            }
            seen.add(n);
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