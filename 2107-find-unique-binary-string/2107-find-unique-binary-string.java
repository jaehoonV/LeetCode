class Solution {
    public String findDifferentBinaryString(String[] nums) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i].charAt(i) == '0') {
                output.append('1');
            } else {
                output.append('0');
            }
        }
        return output.toString();
    }
}