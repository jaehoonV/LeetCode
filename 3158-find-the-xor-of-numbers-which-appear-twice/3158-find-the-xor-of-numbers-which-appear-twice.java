class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashSet<Integer>set = new HashSet<>();
        int output = 0;
        for (int n : nums){
            if (set.contains(n)) output ^= n;
            else set.add(n);
        }
        return output;
    }
}