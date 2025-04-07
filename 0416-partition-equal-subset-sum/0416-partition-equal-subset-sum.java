class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) sum += num;
        if (sum % 2 != 0) return false;

        int cur_sum = sum / 2;

        boolean[] dp = new boolean[cur_sum + 1];
        dp[0] = true;
        for (int num : nums) {
            for (int currSum = cur_sum; currSum >= num; currSum--) {
                dp[currSum] = dp[currSum] || dp[currSum - num];
                if (dp[cur_sum]) return true;
            }
        }
        
        return dp[cur_sum];
    }
}