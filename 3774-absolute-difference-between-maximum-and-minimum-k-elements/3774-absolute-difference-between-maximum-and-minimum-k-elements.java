class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int a = 0, b = 0, n = nums.length;

        for(int i = 0; i < k; i++) {
            a += nums[i];
            b += nums[n - 1 - i];
        }
        
        return Math.abs(b - a);
    }
}