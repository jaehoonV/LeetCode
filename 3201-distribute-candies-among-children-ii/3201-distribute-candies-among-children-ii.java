class Solution {
    public long distributeCandies(int n, int limit) {
        long output = ((long)n + 2) * (n + 1) / 2;

        for(int i = 1; i <= 3; i++) {
            long temp = n - (long)i * (limit + 1);

            if(temp < 0) break;

            long a = (temp + 2) * (temp + 1) / 2;
            long b = (i < 3 ? 3 : 1);
            output += (i % 2 != 0 ? -b * a : b * a);
        }
        return output;
    }
}