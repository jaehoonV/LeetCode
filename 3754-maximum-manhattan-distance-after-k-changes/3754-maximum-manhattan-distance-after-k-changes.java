class Solution {
    public int maxDistance(String str, int k) {
        int n = 0, s = 0, e = 0, w = 0;
        int output = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == 'N') {
                n++;
            }else if(c == 'S') {
                s++;
            }else if(c == 'E') {
                e++;
            }else {
                w++;
            }

            int a = Math.abs(n - s) + Math.abs(e - w);
            int b = Math.min(2 * k, i + 1 - a);
            output = Math.max(output, a + b);
        }

        return output;
    }
}