class Solution {
    public int binaryGap(int n) {
        String bin = Integer.toBinaryString(n);
        int output = 0;
        int lastIndex = -1;

        for (int i = 0; i < bin.length(); i++) {
            if (bin.charAt(i) == '1') {
                if (lastIndex != -1) {
                    output = Math.max(output, i - lastIndex);
                }
                lastIndex = i;
            }
        }

        return output;
    }
}