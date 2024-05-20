class Solution {
    int output = 0; 
    
    public int subsetXORSum(int[] nums) {
        dfs(nums, 0, output);
        return output;
    }
    
    public void dfs(int[] nums, int s, int a) {
        if(s >= nums.length) return;
        
        for(int i = s; i < nums.length; i++) {
            int temp = a ^ nums[i];
            output += temp;
            dfs(nums, i + 1, temp);
        }
    }
}