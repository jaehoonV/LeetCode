class Solution {
    public int mirrorDistance(int n) {
        int a = n, b=0;
        while(n > 0){
            b = n % 10 + b * 10;
            n /= 10;
        }

        return Math.abs(a - b);
    }
}