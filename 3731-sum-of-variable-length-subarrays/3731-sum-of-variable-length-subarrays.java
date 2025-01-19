class Solution {
    public int subarraySum(int[] nums) {
        int n = nums.length, output = 0;
        for(int i = 0; i < n; i++){
            int start = Math.max(0, i - nums[i]);
            for(int j = start; j <= i; j++){
                output += nums[j];
            }
        }
        return output;
    }
}