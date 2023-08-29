class Solution {
    public int bestClosingTime(String customers) {
        int max = 0, s = 0, time = -1;
        
        for (int i = 0; i < customers.length(); i++) {
            s += (customers.charAt(i) == 'Y') ? 1 : -1;
            if (s > max) {
                max = s;
                time = i;
            }
        }
        return time + 1;
    }
}
