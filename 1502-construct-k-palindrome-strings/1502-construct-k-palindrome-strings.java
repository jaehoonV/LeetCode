class Solution {
    public boolean canConstruct(String s, int k) {
        int n = s.length();
        if(n < k) return false;

        char[] c = s.toCharArray();
        Arrays.sort(c);
        int cnt = 0, i = 0;

        while(i < n) {
            char current = c[i];
            int count = 0;
            while (i < n && c[i] == current) {
                count++;
                i++;
            }

            if(count % 2 != 0) cnt++;
        }

        return cnt <= k;
    }
}