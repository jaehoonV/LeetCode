class Solution {
    public int minOperations(int[] nums, int k) {
        int output = 0;
        Set<Integer> set = new HashSet<>();

        for(int n : nums) {
            set.add(n);
        }

        for (int n : set) {
            if(n > k) {
                output++;
            }else if(n < k) {
                return -1;
            } 
        }

        return output;
    }
}