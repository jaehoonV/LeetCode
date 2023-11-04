class Solution {
    public int findKOr(int[] nums, int k) {
        int output = 0; 
        for (int i = 0; i < 31; i++) {
            int temp = (1 << i);
            int cnt = 0;

            for (int n : nums) {
                if ((temp & n) != 0) cnt++;
            }

            if (cnt >= k) output += temp;
        }

        return output;
    }
}