class Solution {
    public int distributeCandies(int n, int limit) {
        java.util.function.Function<Integer, Long> comb = x -> 1L * x * (x - 1) / 2;

    // Check if n is greater than 3 times limit
    if (n > 3 * limit) {
        return 0;
    }

    long ans = comb.apply(n + 2);

    if (n > limit) {
        ans -= 3 * comb.apply(n - limit + 1);
    }

    if (n - 2 >= 2 * limit) {
        ans += 3 * comb.apply(n - 2 * limit);
    }

    // Return the final result
    return (int)ans;
    }
}