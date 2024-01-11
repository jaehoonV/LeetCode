class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        
        for(int i = 0; i < nums1.length; i++) set1.add(nums1[i]);
        for(int i = 0; i < nums2.length; i++) set2.add(nums2[i]);
        
        int output[] = new int[2];
        int count=0;
        
        for(int i = 0; i < nums1.length; i++) {
           if(set2.contains(nums1[i])) count++;  
        }
        
        output[0] = count;
        count = 0;
        
        for(int i = 0; i < nums2.length; i++) {
           if(set1.contains(nums2[i])) count++;  
        }
        output[1] = count;
        return output;
    }
}