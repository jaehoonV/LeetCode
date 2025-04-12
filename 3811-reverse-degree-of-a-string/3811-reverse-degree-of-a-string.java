class Solution {
    public int reverseDegree(String s) {
        int output = 0;

        for(int i = 0; i < s.length(); i++){
            output += (Math.abs(s.charAt(i) - 'z') + 1) * (i + 1);
        }

        return output;
    }
}