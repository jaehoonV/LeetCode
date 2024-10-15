class Solution {
    public long minimumSteps(String s) {
		int n = s.length(), i = 0;
        long output = 0, cnt = 0;

        while(i < n) {
            if(s.charAt(i) == '1') cnt++;
            else output += cnt;
            
            i++;
        }

        return output;
    }
}