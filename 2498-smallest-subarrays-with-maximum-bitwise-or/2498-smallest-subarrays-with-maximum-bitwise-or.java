class Solution {
    public int[] smallestSubarrays(int[] nums) {
        int l = nums.length;
        int[] temp = new int[30];
        int[] output = new int[l];

        for(int i = 0; i < l; i++) output[i] = 1;

        for(int i = l - 1; i >= 0; i--) {
            for(int j = 0; j < 30; j++) {
                if((nums[i] & (1 << j)) > 0) temp[j] = i;

                output[i] = Math.max(output[i], temp[j] - i + 1);
            }
        }
        return output;
    }
}