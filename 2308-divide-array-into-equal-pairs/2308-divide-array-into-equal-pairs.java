class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer, Integer> cnt = new HashMap<>();
        for (int n : nums) {
            cnt.put(n, cnt.getOrDefault(n, 0) + 1);
        }
        
        for (int c : cnt.values()) {
            if (c % 2 != 0) return false;
        }
        
        return true;
    }
}