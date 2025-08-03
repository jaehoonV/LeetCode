class Solution {
    public boolean checkDivisibility(int n) {
        int nn = n;
        int a = 0;
        int b = 1;

        while(n > 0){
            int temp = n % 10;
            a += temp;
            b *= temp;
            n /= 10;
        }
        return nn % (a + b) == 0;
    }
}