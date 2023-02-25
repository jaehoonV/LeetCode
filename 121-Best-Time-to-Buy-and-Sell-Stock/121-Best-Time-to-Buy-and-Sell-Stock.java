class Solution {
    public int maxProfit(int[] prices) {
        int output = 0;
        int temp = Integer.MAX_VALUE;
        for(int i = 0; i < prices.length; i++){
            temp = Math.min(temp, prices[i]);
            output = Math.max(output, prices[i] - temp);
        }
        return output;
    }
}