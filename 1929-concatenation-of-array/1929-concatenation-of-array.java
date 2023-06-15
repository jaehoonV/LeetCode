class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] output = new int[n * 2];

        System.arraycopy(nums, 0, output, 0, n);
        System.arraycopy(nums, 0, output, n, n);
        
        return output;
    }
}