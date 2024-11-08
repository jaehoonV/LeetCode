class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int n = nums.length;
        int[] output = new int[n];
        int temp = 0;
        int max = (1 << maximumBit) - 1;

        for(int i = 0; i < n; i++) {
            temp ^= nums[i];
            output[n - i - 1] = temp ^ max;
        }

        return output;
    }
}