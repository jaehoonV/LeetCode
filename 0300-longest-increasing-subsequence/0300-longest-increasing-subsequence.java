class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length, output = 1;
        int[] temp = new int[n];
        
        temp[0] = nums[0];

        for (int i = 1; i < n; i++) {
            if (temp[output - 1] < nums[i]) {
                temp[output++] = nums[i];
            } else {
                int a = Arrays.binarySearch(temp, 0, output, nums[i]);
                if (a < 0) a = - (a + 1);
                
                temp[a] = nums[i];
            }
        }
        return output;
    }
}