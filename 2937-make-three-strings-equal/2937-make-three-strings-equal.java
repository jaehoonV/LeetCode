class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
        int n = Math.min(s1.length(), Math.min(s2.length(), s3.length()));
        int output = s1.length() + s2.length() + s3.length(); 
        if (s1.charAt(0) != s2.charAt(0) || s1.charAt(0) != s3.charAt(0) || s2.charAt(0) != s3.charAt(0)) {
            return -1; 
        }
       
        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) == s2.charAt(i) && s2.charAt(i) == s3.charAt(i)) output -= 3;
            else break;
        }

        return output;
    }
}