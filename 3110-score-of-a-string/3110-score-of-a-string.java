class Solution {
    public int scoreOfString(String s) {
        char temp = s.charAt(0);
        int output = 0;
        for(int i = 1; i < s.length(); i++){
            output += Math.abs(temp - s.charAt(i));
            temp = s.charAt(i);
        }
        
        return output;
    }
}