class Solution {
    public int findKthNumber(int n, int k) {
        int output = 1; 
        k--;

        while (k > 0) {
            int steps = func(n, output, output + 1);
            if (steps <= k) {
                output += 1;
                k -= steps;
            } else {
                output *= 10;
                k--;
            }
        }

        return output;
    }
    
    public int func(int n, long output, long next) {
        int steps = 0;
        while (output <= n) {
            steps += Math.min(n + 1, next) - output;
            output *= 10;
            next *= 10;
        }
        return steps;
    }
}