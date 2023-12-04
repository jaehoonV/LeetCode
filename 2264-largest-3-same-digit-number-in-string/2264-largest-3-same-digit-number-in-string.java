class Solution {
    public String largestGoodInteger(String num) {
        int output = -1;
        for (int i = 0; i < num.length() - 2; i++) {
            if (num.charAt(i) == num.charAt(i + 1) && num.charAt(i) == num.charAt(i + 2)) {
                output = Math.max(output, num.charAt(i) - '0');
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            sb.append((char)(48 + output));
        }
        return output == -1 ? "" : sb.toString();
    }
}