class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int output = 0;
        for(int n2 : nums2){
            int temp = n2 * k;
            for(int n1 : nums1){
                if(n1 % temp == 0) output++;
            }
        }
        return output;
    }
}