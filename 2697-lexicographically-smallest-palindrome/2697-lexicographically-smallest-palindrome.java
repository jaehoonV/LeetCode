class Solution {
    public String makeSmallestPalindrome(String s) {
        int a = s.length() / 2 - 1;
        int b = s.length() / 2 + (s.length() % 2);
        
        StringBuilder sb = new StringBuilder(s);
        
        while(a >= 0 && b < s.length()){
            int a_int = s.charAt(a);
            int b_int = s.charAt(b);
            if(s.charAt(a) != s.charAt(b)){
                if(a_int > b_int) sb.replace(a, a + 1, String.valueOf(s.charAt(b)));
                else sb.replace(b, b + 1, String.valueOf(s.charAt(a)));
            }
            a--;
            b++;
        }
        
        return sb.toString();
    }
}