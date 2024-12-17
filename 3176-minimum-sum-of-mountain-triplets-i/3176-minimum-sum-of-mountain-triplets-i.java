class Solution {
    public int minimumSum(int[] nums) {
        int n = nums.length, pre[] = new int[n], suf[] = new int[n], prevp = Integer.MAX_VALUE, prevs = Integer.MAX_VALUE, output = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++) {
            prevp = pre[i] = Math.min(nums[i], prevp);
            prevs = suf[n - i - 1] = Math.min(nums[n - i - 1], prevs);
        }

        for(int i = 1; i < n - 1; i++) {
            if(pre[i - 1] < nums[i] && nums[i] > suf[i + 1])
                output = Math.min(output, nums[i] + pre[i - 1] + suf[i + 1]);
        }
        return output == Integer.MAX_VALUE ? -1: output;
    }
}