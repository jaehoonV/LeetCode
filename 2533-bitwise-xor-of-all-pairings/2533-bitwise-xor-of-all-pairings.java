class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length, x1 = 0, x2 = 0;

        if (n1 % 2 != 0) for (int n : nums2) x2 ^= n;
        if (n2 % 2 != 0) for (int n : nums1) x1 ^= n;
        return x1 ^ x2;
    }
}