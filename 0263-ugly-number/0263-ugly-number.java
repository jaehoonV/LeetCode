class Solution {
    public boolean isUgly(int n) {
        if(n == 0) return false;
        
        // 나누어 떨어지면 반복
        while(n % 2 == 0) n = n / 2;
        while(n % 3 == 0) n = n / 3;
        while(n % 5 == 0) n = n / 5;

        return n == 1 ;
    }
}