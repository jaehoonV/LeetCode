class Solution {
    public char findKthBit(int n, int k) {
        StringBuilder sb = new StringBuilder("0");

        for (int i = 2; i <= n; i++) {
            StringBuilder t = new StringBuilder();

            for (int j = 0; j < sb.length(); j++) {
                t.append(sb.charAt(j) == '0' ? '1' : '0');
            }

            t.reverse();
            sb.append("1").append(t);
        }

        return sb.charAt(k - 1);
    }
}