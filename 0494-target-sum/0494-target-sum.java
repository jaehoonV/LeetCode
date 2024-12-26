class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return func(nums, target, 0, 0);
    }
	
	public int func(int[] nums, int target, int i, int output) {
        if (i == nums.length) return output == target ? 1 : 0;
        
        int m = func(nums, target, i + 1, output - nums[i]);
        int p = func(nums, target, i + 1, output + nums[i]);

        return m + p;
    }
}