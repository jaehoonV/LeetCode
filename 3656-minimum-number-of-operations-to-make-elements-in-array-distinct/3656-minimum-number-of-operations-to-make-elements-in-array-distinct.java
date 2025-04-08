class Solution {
    public int minimumOperations(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        for (int i = nums.length - 1; i >= 0; i--) {
            if(set.contains(nums[i])) {
                if((i + 1) % 3 == 0) return (int)((i + 1) / 3);
                return (int)((i + 1) / 3 + 1);
            }

            set.add(nums[i]);
        }

        return 0;
    }
}