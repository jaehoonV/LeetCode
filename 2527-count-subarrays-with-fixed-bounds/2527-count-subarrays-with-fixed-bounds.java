class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long output = 0;
        int n = nums.length;
        int s = -1, min_v = -1, max_v = -1;
        for (int i = 0; i < n; i++) {
            if (nums[i] < minK || nums[i] > maxK) s = i;
            if (nums[i] == maxK) max_v = i;
            if (nums[i] == minK) min_v = i;
            int v = Math.max(0, Math.min(min_v, max_v) - s);
            output += v;
        }
        return output;
    }
}