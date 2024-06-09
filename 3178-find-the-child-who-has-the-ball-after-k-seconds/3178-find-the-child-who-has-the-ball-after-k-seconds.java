class Solution {
    public int numberOfChild(int n, int k) {
        int a = (n * 2) - 2;
        int b = k % a;
        
        return b >= n ? (2 * n - 2 - b) : b;
    }
}