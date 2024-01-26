class Solution {
    public int minimumPushes(String word) {
        int output = 0;
        int n = word.length();
        int r = 1;

        int a = n / 8;
        int temp = n % 8;

        while (a > 0) {
            output += 8 * r;
            a--;
            r++;
        }
        output += temp * r;

        return output; 
    }
}