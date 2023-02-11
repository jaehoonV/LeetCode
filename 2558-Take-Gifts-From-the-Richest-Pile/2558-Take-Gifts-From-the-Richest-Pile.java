class Solution {
    public long pickGifts(int[] gifts, int k) {
        int n = gifts.length;
        for(int i = 0; i < k; i++){
            Arrays.sort(gifts);
            gifts[n - 1] = (int)Math.sqrt(gifts[n - 1]);
        }
        long output = 0;
        for(int i = 0; i < n; i++){
            output += gifts[i];
        }
        return output;
    }
}