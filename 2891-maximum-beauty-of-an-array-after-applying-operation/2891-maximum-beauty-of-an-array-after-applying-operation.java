class Solution {
    public int maximumBeauty(int[] nums, int k) {
        if (nums.length == 1) return 1;

        int output = 0, max = 0;

        for (int num : nums) max = Math.max(max, num);

        int[] temp = new int[max + 1];

        for (int num : nums) {
            temp[Math.max(num - k, 0)]++;
            temp[Math.min(num + k + 1, max)]--;
        }

        int a = 0;

        for (int t : temp) {
            a += t;
            output = Math.max(output, a);
        }

        return output;
    }
}