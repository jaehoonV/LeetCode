class Solution {
    public int numberOfWays(int n, int x) {
        long[] dp = new long[n + 1];
        dp[0] = 1; 

        for (int i = 1; Math.pow(i, x) <= n; i++) {
            int a = (int) Math.pow(i, x);
            for (int sum = n; sum >= a; sum--) {
                dp[sum] = (dp[sum] + dp[sum - a]) % 1_000_000_007;
            }
        } return (int) dp[n];
    }
}