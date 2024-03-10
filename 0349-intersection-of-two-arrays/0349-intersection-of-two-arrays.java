class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>(); // nums1 중복 제거
        for (int n : nums1) {
            set1.add(n);
        }
        
        Set<Integer> Intersection = new HashSet<>(); // 교집합 저장 set
        for (int n : nums2) {
            if (set1.contains(n)) Intersection.add(n);
            
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