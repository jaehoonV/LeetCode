class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int output = 0;
        int a = nums[0];
        for(int i = 1; i < nums.length; i++){
            output = Math.max(output, Math.abs(nums[i] - a));
            a = nums[i];
        }

        return Math.max(output, Math.abs(a - nums[0]));
    }
}