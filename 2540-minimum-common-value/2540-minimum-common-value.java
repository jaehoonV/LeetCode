class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hm=  new HashMap<>();

        for(int n : nums1){
            hm.put(n,1);
        }
        for(int n : nums2){
            if(hm.containsKey(n)) return n;
        }
        return -1;
    }
}