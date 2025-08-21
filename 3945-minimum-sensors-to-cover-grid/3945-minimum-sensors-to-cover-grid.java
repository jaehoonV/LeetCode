class Solution {
    public int minSensors(int n, int m, int k) {
        int t = k * 2 + 1;
        int a = n / t + (n % t == 0 ? 0 : 1);
        int b = m / t + (m % t == 0 ? 0 : 1);
        return a * b;
    }
}