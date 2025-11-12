class Solution {
    public int minMoves(int[] nums) {
        int max = nums[0], output = 0, l = nums.length;
        for(int i = 1; i < l; i++) {
            max = Math.max(max, nums[i]);
        }
        for(int i = 0; i < l; i++) {
            output += max - nums[i];
        }
        return output;
    }
}