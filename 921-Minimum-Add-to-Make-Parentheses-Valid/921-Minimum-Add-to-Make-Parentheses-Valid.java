class Solution {
    public int minAddToMakeValid(String s) {
        int output_a = 0;
        int output_b = 0;
        
        for (char c : s.toCharArray()) {
            if (c == '(') output_b++;
            else if (c == ')') {
                if (output_b > 0) output_b--;
                else output_a++;
            }
        }
        
        return output_a + output_b;
    }
}