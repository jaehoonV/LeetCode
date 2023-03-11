class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hm=  new HashMap<>();

        for(int i = 0; i < nums1.length; i++){
            hm.put(nums1[i],1);
        }
        for(int i = 0; i < nums2.length; i++){
            if(hm.containsKey(nums2[i])) return nums2[i];
        }
        return -1;
    }
}