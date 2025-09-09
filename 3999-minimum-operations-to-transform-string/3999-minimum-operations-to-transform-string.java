class Solution {
    public int minOperations(String s) {
        int output = 0;

        for(char c : s.toCharArray()){
            int step = (26 - (c - 'a')) % 26;
            output = Math.max(output, step);
        }
        return output;
    }
}