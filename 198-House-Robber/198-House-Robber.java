class Solution {
    public int rob(int[] nums) {
        int a = 0, output = 0;
        for (int n : nums) {
            int temp = Integer.max(a + n, output);
            a = output;
            output = temp;
        }
        return output;
    }
}