class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max = nums[0];
        
        for (int n: nums){
            max = Math.max(n, max);
        }
        int output = max++;
        
        for (int i = 0; i < k - 1; i++){
            output += max++;
        }
        
        return output;
    }
}