class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];

        for(int i = 0; i < n; i++){
            output[i] = nums[(i + n + nums[i] % n) % n];
        }

        return output;
    }
}