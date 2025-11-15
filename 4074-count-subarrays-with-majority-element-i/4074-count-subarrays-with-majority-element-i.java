class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length, a = n + 1, output = 0;
        int[] cnt = new int[2 * n + 2];
        int[] temp = new int[2 * n + 2];
        cnt[a] = temp[a] = 1;
        for (int t : nums) {
            a += (t == target ? 1 : -1);
            cnt[a]++;
            temp[a] = temp[a - 1] + cnt[a];
            output += temp[a - 1];
        }
        return output;
    }
}