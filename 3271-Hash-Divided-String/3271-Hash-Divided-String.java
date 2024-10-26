class Solution {
    public String stringHash(String s, int k) {
        int n = s.length();
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < n; i += k) {
            String temp = s.substring(i, i + k);
            int sum = 0;

            for (char c : temp.toCharArray()) {
                sum += c - 'a';
            }

            int c_temp = sum % 26;
            output.append((char) (c_temp + 'a'));
        }

        return output.toString();
    }
}