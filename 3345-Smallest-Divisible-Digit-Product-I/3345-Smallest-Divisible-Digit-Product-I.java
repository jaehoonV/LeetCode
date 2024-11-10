class Solution {
    public int smallestNumber(int n, int t) {
        int output = n;

        while (true) {
            if (func(output, t)) return output;
            output++;
        }
    }

    private boolean func(int output, int t) {
        int product = 1;
        while (output > 0) {
            int digit = output % 10;
            product *= digit;
            output /= 10;
        }
        return product % t == 0;
    }
    
}