class Solution {
    public long countAlternatingSubarrays(int[] nums) {
        long output = 0;
        int i = 0, j = 1, n = nums.length;
        
        while(j < n){
            if(nums[j] == nums[j - 1]) i = j;
            else output += (j - i);
            j++;
        }
        
        return output + n;
    }
}