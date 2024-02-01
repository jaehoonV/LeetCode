class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n = nums.length;
        int [][] output = new int[n / 3][3];
        Arrays.sort(nums);
        
        for (int i = 2; i < n; i += 3) {
            int a = nums[i];
            int b = nums[i - 1];
            int c = nums[i - 2];
            
            if(a - c > k) return new int[0][];
            
            output[i / 3] = new int[]{c, b, a};
        }
        return output;
    }
}