class Solution {
    public int numIdenticalPairs(int[] nums) {
        int n = nums.length, output = 0;
        for(int i = 0; i < n; i++){
            int a = nums[i];
            for(int j = i + 1; j < n; j++){
                if(a == nums[j]) output++;
            }
        }
        return output;
    }
}