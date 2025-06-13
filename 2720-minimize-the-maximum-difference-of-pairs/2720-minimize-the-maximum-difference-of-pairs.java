class Solution {
    public int minimizeMax(int[] nums, int p) {
        if(p == 0) return 0;

        Arrays.sort(nums);
        int n = nums.length, l = 0, r = nums[n - 1] - nums[0];

        while(l < r) {
            int m = l + (r - l) / 2, t = 0;
            for(int i = 1; i < n; i++) {
                if(nums[i] - nums[i - 1] <= m) {
                    t++;
                    i++;
                }
            }

            if(t >= p) r = m;
            else l = m + 1;
        }

        return l;
    }
}