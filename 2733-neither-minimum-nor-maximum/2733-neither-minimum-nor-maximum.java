class Solution {
    public int findNonMinOrMax(int[] nums) {
        int n = nums.length;
        
        if(n == 2) return -1;
        
        int max = Arrays.stream(nums).max().getAsInt();
        int min = Arrays.stream(nums).min().getAsInt();
        
        for(int num : nums){
            if(num != max && num != min) return num;
        }
        
        return -1;
    }
}