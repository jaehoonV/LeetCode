class Solution {
    public int maximumDifference(int[] nums) {
        int min = nums[0];
        int output = -1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > min) output = Math.max(output, nums[i] - min);
            else min = nums[i];
        }

        return output;
    }
}