class Solution {
    public int maximumLength(int[] nums, int k) {
        int output = 2;
        for(int i = 0; i < k; i++) {
            int[] temp = new int[k];

            for(int j = 0; j < nums.length; j++) {
                int mod = nums[j] % k;
                int pos = (i - mod + k) % k;
                temp[mod] = temp[pos] + 1;
            }

            for(int t : temp) {
                output = Math.max(output, t);
            }
        }
        return output;
    }
}