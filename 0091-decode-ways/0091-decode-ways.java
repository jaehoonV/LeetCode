class Solution {
    public int numDecodings(String s) {
    int[] arr = new int[s.length()];
        Arrays.fill(arr, -1);
        return func(s, 0, arr);
    }

    private int func(String s, int i, int[] arr) {
        if (i == s.length()) return 1;

        if (arr[i] != -1) return arr[i];

        if (s.charAt(i) == '0') return 0;
        
        int ways = func(s, i + 1, arr);
        if (i + 1 < s.length() && Integer.parseInt(s.substring(i, i + 2)) <= 26) {
            ways += func(s, i + 2, arr);
        }

        arr[i] = ways;
        return ways;
    }
}