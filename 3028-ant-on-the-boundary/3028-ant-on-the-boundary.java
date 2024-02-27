class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int output = 0, temp = 0;
        for (int n : nums) {
            temp += n;
            if (temp == 0) output++;
        }
        return output;
    }
}