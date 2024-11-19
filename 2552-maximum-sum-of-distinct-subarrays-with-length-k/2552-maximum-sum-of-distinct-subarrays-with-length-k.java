class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        long temp = 0;
        long output = 0;
        int i = 0;
        
        for (int j = 0; j < n; j++) {
            if (!set.contains(nums[j])) {
                temp += nums[j];
                set.add(nums[j]);
                
                if (j - i + 1 == k) {
                    output = Math.max(output, temp);
                    temp -= nums[i];
                    set.remove(nums[i]);
                    i++;
                }
            } else {
                while (nums[i] != nums[j]) {
                    temp -= nums[i];
                    set.remove(nums[i]);
                    i++;
                }
                i++;
            }
        }
        
        return output;
    }
}