class Solution {
//      Time Limit Exceeded O(2^n)
//     int cnt = 0;
//     public int combinationSum4(int[] nums, int target) {
//         combination(nums, target);
//         return cnt;
//     }
    
//     public void combination(int[] nums, int target){
//         if(target == 0) {
//             cnt++;
//             return;
//         } else if(target < 0){
//             return;
//         }
        
//         for(int i = 0; i < nums.length; i++){ // 재귀 함수
//             combination(nums, target - nums[i]);
//         }
//     }
    
    // dp
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target+1];
        dp[0] = 1;
        
        for (int i = 0; i < target; i++) {
            if (dp[i] == 0) continue;
            for (int n : nums) 
                if (i + n <= target) 
                    dp[i + n] += dp[i];
        }
        
        return dp[target];
    }
}