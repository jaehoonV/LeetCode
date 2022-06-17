class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>(); // nums1 중복 제거
        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }
        
        Set<Integer> Intersection = new HashSet<>(); // 교집합 저장 set
        for (int i = 0; i < nums2.length; i++) {
            if (set1.contains(nums2[i])) {
                Intersection.add(nums2[i]);
            }
        }
        // 배열로 변환후 반환
        int[] output = new int[Intersection.size()];
        int i = 0;
        for (Integer n : Intersection) {
            output[i++] = n;
        }
        return output;
    }
}