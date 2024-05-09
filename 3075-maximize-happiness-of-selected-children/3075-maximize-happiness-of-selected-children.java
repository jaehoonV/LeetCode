class Solution {
    public long maximumHappinessSum(int[] h, int k) {
        long output = 0, t = 0;
        int n = h.length;
        Arrays.sort(h);

        for (int i = n - 1; i >= n - k; i--) {
            output += Math.max(0, h[i] - t);
            t++;
        }

        return output;
    }
    
}