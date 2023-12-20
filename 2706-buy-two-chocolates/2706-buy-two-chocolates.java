class Solution {
    public int buyChoco(int[] prices, int m) {
        Arrays.sort(prices);
        
        return (prices[0] + prices[1]) > m ? m : m - (prices[0] + prices[1]);
    }
}