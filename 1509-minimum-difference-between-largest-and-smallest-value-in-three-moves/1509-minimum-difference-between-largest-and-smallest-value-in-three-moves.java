class Solution {
    public int minDifference(int[] nums) {
        int n = nums.length;
        if(n <= 4) return 0;
        
        Arrays.sort(nums);
        int output = nums[n - 1] - nums[0];
        for(int i = 0; i <= 3; i++) {
            output = Math.min(output, nums[n + i - 4] - nums[i]);
        }
        return output;
    }
}