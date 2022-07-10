class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = cost[1];
        
        int i = 2;
        while(i < dp.length){ //Dynamic programming
            dp[i] = Math.min(dp[i - 2], dp[i - 1]) + cost[i];
            i++;
        }
        
        return Math.min(dp[dp.length - 1], dp[dp.length - 2]);
    }
}