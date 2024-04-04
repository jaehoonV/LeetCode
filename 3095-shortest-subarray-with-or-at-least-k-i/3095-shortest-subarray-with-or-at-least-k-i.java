class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        int len = n + 1, temp = 0;
        for(int i = 0; i < n; i++){
            temp=0;
            for(int j = i; j < n; j++){
                temp |= nums[j];
                if(temp >= k) len = Math.min(len, j - i + 1);
            }
        }
        return len == n + 1 ? -1 : len;
    }
}