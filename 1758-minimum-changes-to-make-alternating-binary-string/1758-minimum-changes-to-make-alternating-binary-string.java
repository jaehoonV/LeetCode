class Solution {
    public int minOperations(String s) {
        int output1 = 0;
        int output2 = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                if (s.charAt(i) == '0') output2++;
                else output1++;
            } else {
                if (s.charAt(i) == '1') output2++;
                else output1++;
            }
        }

        return Math.min(output1, output2);
    }
}