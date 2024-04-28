class Solution {
    public int minimumAddedInteger(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int output = Integer.MAX_VALUE;
        int n1 = nums1.length;
        HashMap<Integer, Integer> nums1_map = new HashMap<>();
        
        for(int n : nums1){
            nums1_map.put(n, nums1_map.getOrDefault(n, 0) + 1);
        }
        
        Loop1:
        for(int i = 0; i < n1; i++){
            HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>(nums1_map);
            int temp = nums2[0] - nums1[i];
            for(int j = 0; j < nums2.length; j++){
                int b = nums2[j] - temp;
                if(hm.containsKey(b) && hm.get(b) > 0) hm.put(b, hm.get(b) - 1);
                else continue Loop1;
            }
            output = Math.min(output, temp);
        }
        
        return output;
    }
}