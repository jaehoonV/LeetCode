class Solution {
    public int[] sumZero(int n) {
        int[] output = new int[n];
        int index = 0;

        if(n % 2 != 0) {
            output[index++] = 0;
        }

        for (int i = 1; i <= n / 2; i++) {
            output[index++] = i;
            output[index++] = -i;
        }

        return output;
    }
}