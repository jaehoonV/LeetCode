class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int i = 0, cnt = 0, output = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == 1) {
                goal--;
                cnt = 0;
            }
            
            while (goal == 0 && i <= j) {
                goal += nums[i];
                i++;
                cnt++;
                if (i > j - goal + 1) break;
            }
            
            while (goal < 0) {
                goal += nums[i];
                i++;
            }
            
            output += cnt;
        }
        return output;
    }
}