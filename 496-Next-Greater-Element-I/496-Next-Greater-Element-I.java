class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] output = new int[n];

        for(int i = 0; i < n; i++){
            output[i] = func(nums1[i], nums2);
        }
        return output;
    }

    public int func(int a, int[] nums2){
        int b = -1;
        int temp = 0;
        int n = nums2.length;
        for(int i = 0; i < n; i++){
            if(nums2[i] == a) {
                temp = i;
                break;
            }
        }
        for(int i = temp + 1; i < n; i++){
            if(nums2[i] > a){
                b = nums2[i];
                break;
            }
        }
        return b;
    }
}