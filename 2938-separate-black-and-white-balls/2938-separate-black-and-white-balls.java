class Solution {
    public long minimumSteps(String s) {
        int n = s.length();

        long output = 0;
        long cnt = 0;

        int i = 0;
        while(i < n) {
            if(s.charAt(i) == '1') cnt++;
            else output += cnt;
            
            i++;
        }

        return output;
    }
}