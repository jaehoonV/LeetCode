class Solution {
    public String triangleType(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        for(int n : nums) set.add(n);

        if(nums[0] + nums[1] <= nums[2]) return "none";
        if(set.size() == 1) return "equilateral";
        if(set.size() == 2) return "isosceles";
        return "scalene";
    }
}