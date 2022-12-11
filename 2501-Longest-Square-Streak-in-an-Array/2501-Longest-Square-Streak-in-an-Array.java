class Solution {
    public int longestSquareStreak(int[] nums) {
        int output = 0;
        Set<Integer> set = new HashSet<>();
        for(int i : nums) set.add(i);
        for(int i = 0; i < nums.length; i++) {
            int n = nums[i];
            int cnt = 1;
            while(set.contains(n * n)) {
                n = n * n;
                cnt++;
            }
            if(cnt > 1 && cnt > output) output = cnt;
        }
        return output == 0 ? -1 : output;
    }
}