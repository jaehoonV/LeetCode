class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        dp[0] = cost[0];
        dp[1] = cost[1];
        
        int i = 2;
        while(i < n){
            dp[i] = Math.min(dp[i - 2], dp[i - 1]) + cost[i];
            i++;
        }
        
        return Math.min(dp[n - 1], dp[n - 2]);
    }
}