class Solution {
    public int centeredSubarrays(int[] nums) {
        int n = nums.length;
        int output = 0;

        for(int i = 0; i < n; i++) {
            int sum = 0;
            HashSet<Integer> set = new HashSet<>();
            for (int j = i; j < n; j++) {
                sum += nums[j];
                set.add(nums[j]);
                output += set.contains(sum) ? 1 : 0;
            }
        }

        return output;
    }
}