class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int a = purchaseAmount / 10;
        int b = purchaseAmount % 10;
        
        return b > 4 ? 100 - ((a + 1) * 10) : 100 - a * 10;
    }
}