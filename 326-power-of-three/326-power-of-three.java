class Solution {
    public boolean isPowerOfThree(int n) {
        Math.abs(n); // 절대값

        if(n == 0) return false;
        if(n == 1) return true;
        if(n % 3 != 0) return false;

        return solution(n);
    }

    public boolean solution(int n) {
        if(n < 3 && n != 1) return false;
        if(n == 1) return true;
        if(n % 3 != 0) return false;
        n /= 3;
        return solution(n);
    
    }
}