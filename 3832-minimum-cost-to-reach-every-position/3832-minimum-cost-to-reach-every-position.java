class Solution {
    public int[] minCosts(int[] cost) {
        int n = cost.length;
        int[] output = new int[n];
        for (int i = 0; i < n; i++) 
            output[i] = Math.min(i > 0 ? output[i - 1] : Integer.MAX_VALUE, cost[i]);
        return output;
    }
}