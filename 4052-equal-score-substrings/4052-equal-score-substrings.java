class Solution {
    public boolean scoreBalance(String s) {
        int temp = 0;

        for(char c : s.toCharArray()) temp += c - 'a' + 1;
        
        int a = 0;
        for(char c : s.toCharArray()) {
            a += c - 'a' + 1;
            if(2 * a == temp) return true;
        }
        return false;
    }
}