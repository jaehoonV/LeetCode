class Solution {
    public long minCuttingCost(int n, int m, int k) {
        long output = 0;

        if(m <= k && n <= k) return 0;

        if(m > k && n <= k) {
            output += (long)(m - k) * k;
        }

        if(n > k && m <= k) {
            output += (long)(n - k) * k;
        }

        return output;
    }
}