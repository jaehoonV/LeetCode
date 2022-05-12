class Solution {
    public boolean isPalindrome(int x) {
        
        if (x < 0 || (x != 0 && x % 10 == 0)) return false;

        int temp = x; 
        int a = 0; 
    
        while (temp >= 10){ // x를 뒤집음
            a *= 10; 
            a += temp % 10; 
            temp /= 10; 
        }
        
        return a == x / 10 && temp == x % 10;
    }
}