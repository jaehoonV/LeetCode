class Solution {
    public int minOperations(int[] nums) {
        int cnt = 0;
        for(int n : nums) {
            if(n == nums[0]) cnt++;
        }
        return cnt < nums.length ? 1 : 0;
    }
}