class Solution {
    String[] letter = {"", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.isEmpty()) return result;
        
        StringBuilder sb = new StringBuilder();
        backtrack(digits, 0, sb, result);
        
        return result;
    }
    
    private void backtrack(String digits, int i, StringBuilder sb, List<String> result) {
        if (i == digits.length()) {
            result.add(sb.toString());
            return;
        }
        
        int digit = digits.charAt(i) - '1';
        String letters = letter[digit];
        for (char letter : letters.toCharArray()) {
            sb.append(letter);
            backtrack(digits, i + 1, sb, result);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}