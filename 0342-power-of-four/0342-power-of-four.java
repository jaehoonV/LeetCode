class Solution {
    public boolean isPowerOfFour(int n) {
        Math.abs(n); // 절대값
        
        if(n == 1) return true;
        if(n % 4 != 0) return false;
        
        return solution(n);
    }
    
    public boolean solution(int n) {
        if(n < 4 && n != 1) return false;
        if(n == 1) return true;
        if(n % 4 != 0) return false;
        return solution(n / 4);
    }
}