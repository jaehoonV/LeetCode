class Solution {
    public long sumAndMultiply(int n) {
        if(n == 0) return 0;
        StringBuilder sb = new StringBuilder();
        long sum = 0;

        while (n > 0) {
            int t = n % 10;
            if (t > 0) {
                sb.append(t);
                sum += t;
            }
            n = n / 10;
        }

        sb = sb.reverse();
        return sum * Long.parseLong(sb.toString());
    }
}