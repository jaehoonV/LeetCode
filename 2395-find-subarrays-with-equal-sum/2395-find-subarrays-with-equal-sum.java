class Solution {
    public boolean findSubarrays(int[] nums) {
        int n = nums.length;
        if(n < 2) return false;
        
        HashSet<Integer> set = new HashSet<>(); 
        
        int i = 0;
        while(i < n - 1){
            int sum = nums[i] + nums[i + 1];
            
            if(set.contains(sum)) return true;
            else set.add(sum);
            
            i++;
        }
        
        return false;
    }
}