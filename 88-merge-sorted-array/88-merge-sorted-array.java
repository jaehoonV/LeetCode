class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;
        while(i >= 0 && j >= 0) { // 높은 수를 맨뒤에서 부터 저장
            nums1[k--] = nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
        }
        while(j >= 0) { // nums2의 수가 더 작은게 있을 경우 nums2를 차례대로 저장
            nums1[k--] = nums2[j--];
        }
    }
}