class Solution {
    public int mostFrequent(int[] nums, int key) {
        Map<Integer, Integer> map = new HashMap<>();
        int output = -1;
        
        for (int i = 0, n = nums.length, max = 0; i + 1 < n; i++) {
            if (nums[i] == key) {
                int temp = nums[i + 1];
                map.put(temp, 1 + map.getOrDefault(temp, 0));
                if (map.get(temp) > max) {
                    max = map.get(temp);
                    output = temp;
                }
            }
        }
        
        return output;
    }
}