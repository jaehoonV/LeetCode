class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int sum = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == 0 && nums[i] == 0) {
                return true;
            }
            
            sum += nums[i];
            
            if (sum % k == 0) return true;
            
            int j = 0;
            int temp = sum;
            
            while (i > j + 1 && temp >= k) {
                temp -= nums[j];
                j++;
                
                if (temp % k == 0) return true;
            }
        }
        
        return false;
    }
}