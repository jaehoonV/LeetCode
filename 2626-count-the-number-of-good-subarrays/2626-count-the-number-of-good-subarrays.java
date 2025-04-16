class Solution {
    public long countGood(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        long output = 0;
        int n = nums.length;
        int l = 0;
        for(int i = 0; i < n; i++) {
            k -= map.getOrDefault(nums[i], 0);
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            while(k <= 0) {
                map.put(nums[l], map.getOrDefault(nums[l], 0) - 1);
                k += map.get(nums[l++]);
            }
            output += l;
        }
        return output;
    }
}