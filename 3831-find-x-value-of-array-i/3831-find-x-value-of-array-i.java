class Solution {
    public long[] resultArray(int[] nums, int k) {
        long[] output = new long[k];
        int[] cnt = new int[k];

        for (int n : nums) {
            int[] temp = new int[k];
            for (int i = 0; i < k; i++) {
                int t = (int)(((long) i * n) % k);
                temp[t] += cnt[i];
                output[t] += cnt[i];
            }
            cnt = temp;
            cnt[n % k]++;
            output[n % k]++;
        }
        return output;
    }
}