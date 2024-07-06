class Solution {
    public int passThePillow(int n, int time) {
        int a = time / (n - 1);
        int b = time % (n - 1);

        return a % 2 == 0 ? b + 1 : n - b;
    }
}