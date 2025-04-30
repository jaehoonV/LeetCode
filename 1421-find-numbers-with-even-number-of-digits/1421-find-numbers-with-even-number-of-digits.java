class Solution {
    public int findNumbers(int[] nums) {
        int output = 0;
        for (int i : nums) {
            String s = Integer.toString(i);
            if (s.length() % 2 == 0) output++;
        }
        return output;
    }
}