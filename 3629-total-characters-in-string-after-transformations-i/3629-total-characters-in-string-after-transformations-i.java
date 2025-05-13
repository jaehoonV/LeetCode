class Solution {
    public int lengthAfterTransformations(String s, int t) {
        int mod = 1_000_000_007;
        int[] dp = new int[t + 26];
        for(int i = 0; i < 26; i++) dp[i] = 1;
        for(int i = 26; i < t + 26; i++) dp[i] = (dp[i - 26] + dp[i - 25]) % mod;
            
        int output = 0;
        for(char c : s.toCharArray()) output = (output + dp[c - 'a' + t]) % mod;
        return output;
    }
}