class Solution {
    public String getEncryptedString(String s, int k) {
        int n = s.length();
        StringBuilder output = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            output.append(s.charAt((i + k) % n));
        }
        
        return output.toString();
    }
}