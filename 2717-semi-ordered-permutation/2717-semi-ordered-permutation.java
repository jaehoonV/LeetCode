class Solution {
    public int semiOrderedPermutation(int[] nums) {
        int n = nums.length, a = 0, b = 0;
    
        for (var i = 0; i < n; i++) {
          if (nums[i] == 1) a = i;
          if (nums[i] == n) b = i;
        }
        return a + (n - 1 - b) - (a > b ? 1 : 0);
    }
}