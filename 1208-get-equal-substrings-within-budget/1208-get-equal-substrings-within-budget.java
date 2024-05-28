class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int i = 0, j = 0, temp = 0, output = 0;
        
        while(j < s.length()) {
            int a = Math.abs(s.charAt(j) - t.charAt(j));
            temp += a;
            
            while(temp > maxCost) {
                int b = Math.abs(s.charAt(i) - t.charAt(i));
                temp -= b;
                i++;
            }
            output = Math.max(j - i + 1,output);
            j++;
        }
        return output;
    
    }
}