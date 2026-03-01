class Solution {
    public int minPartitions(String n) {
        int output = 0;
        for (int i = 0; i < n.length(); i++) {
            output = Math.max(output, n.charAt(i) - '0');
        }
        return output;
    }
}