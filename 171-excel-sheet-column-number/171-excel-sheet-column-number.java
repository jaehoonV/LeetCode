class Solution {
    public int titleToNumber(String columnTitle) {
        if (columnTitle == null) return 0;
        int sum = 0;
        
        for (char c : columnTitle.toCharArray()) {
            sum *= 26; // 자릿수마다 * 26
            sum += c - 'A' + 1; // A = 1부터
        }
        return sum;
    }
}