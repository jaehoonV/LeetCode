class Solution {
    public int longestContinuousSubstring(String s) {
        int output = 0;
        int c = s.charAt(0);
        int temp = 1;
        for(int i = 1; i < s.length(); i++){
            if(c + 1 == s.charAt(i)){
                c = s.charAt(i);
                temp++;
            }else{
                c = s.charAt(i);
                output = Math.max(output, temp);
                temp = 1;
            }        
        }
        return Math.max(output, temp);
    }
}