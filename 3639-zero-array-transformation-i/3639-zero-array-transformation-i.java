class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] temp = new int[n + 1];

        for(int[] q : queries) {
            int l = q[0];
            int r = q[1];
            temp[l]++;

            if(r + 1 < n) temp[r + 1]--;
        }

        int cnt = 0;
        for(int i = 0; i < n; i++) {
            cnt += temp[i];
            if(nums[i] > cnt) return false;
        }

        return true;
    }
}