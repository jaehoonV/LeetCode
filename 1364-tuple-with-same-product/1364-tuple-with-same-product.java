class Solution {
    public int tupleSameProduct(int[] nums) {
        HashMap<Integer, Integer> cnt = new HashMap<>();
        int output = 0;

        for (int i = 0; i < nums.length; i++)
            for (int j = i+1; j < nums.length; j++) {
                int t = nums[i] * nums[j];
                output += 8 * cnt.getOrDefault(t, 0);
                cnt.put(t, cnt.getOrDefault(t, 0) + 1);
            }

        return output;
    }
}