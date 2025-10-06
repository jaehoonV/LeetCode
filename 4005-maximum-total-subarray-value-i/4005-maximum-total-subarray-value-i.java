class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int n : nums) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        return 1L * (max - min) * k;
    }
}