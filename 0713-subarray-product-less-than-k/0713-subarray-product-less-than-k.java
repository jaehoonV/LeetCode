class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length, i = 0, j = 0, output = 0, val = 1;

        while(j < n) {
            val *= nums[j];

            while(val >= k && i <= j) {
                val /= nums[i];
                i++;
            }
            output += (j - i + 1);
            j++;
        }
        return output;
    }
}