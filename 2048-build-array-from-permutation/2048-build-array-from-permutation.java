class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];

        for(int i = 0; i < n; i++){
            output[i] = nums[nums[i]];
        }

        return output;
    }
}