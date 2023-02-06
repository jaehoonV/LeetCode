class Solution {
    public int[] shuffle(int[] nums, int n) {
        int l = nums.length;
        int[] output = new int[l];
        int i = 0;
        int j = n;
        int a = 0;
        while(i < n && j < l){
            output[a++] = nums[i++];
            output[a++] = nums[j++];
        }
        return output;
    }
}