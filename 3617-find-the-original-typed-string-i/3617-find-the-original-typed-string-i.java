class Solution {
    public int possibleStringCount(String word) {
        int output = 1, n = word.length();
        int i = 0;
        
        while(i < n) {
            int j = i;
            while (j < n && word.charAt(j) == word.charAt(i)) {
                j++;
            }
            
            int t = j - i;
            output += t - 1;
            i = j;
        }
        
        return output;
    }
}