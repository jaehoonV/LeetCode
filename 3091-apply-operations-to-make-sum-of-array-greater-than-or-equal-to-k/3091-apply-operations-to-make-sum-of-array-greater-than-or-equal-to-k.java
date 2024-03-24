class Solution {
    public int minOperations(int k) {
        int output = k;
        
        for(int i = 1; i <= k; i++){
            for(int j = 1; j <= k; j++){
                if(i * j >= k) {
                    output = Math.min(output, (i - 1) + (j - 1));
                    break;
                }
            }
        }
        return output;
    }
}