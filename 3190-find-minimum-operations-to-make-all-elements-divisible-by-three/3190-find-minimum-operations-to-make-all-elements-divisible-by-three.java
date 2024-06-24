class Solution {
    public int minimumOperations(int[] nums) {
        int output = 0;
        for (int n : nums) {
            if (n % 3 != 0) output++;
        }
        return output;
    }
}