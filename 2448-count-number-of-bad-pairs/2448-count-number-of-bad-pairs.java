class Solution {
    public long countBadPairs(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            map.put(nums[i] - i, map.getOrDefault(nums[i] - i, 0) + 1);
        }
        long gp = 0;

        for(int key : map.keySet()){
            int v = map.get(key);
            if(v >= 2){
                gp += (long) v * (v - 1) / 2;
            }
        }

        return (long) (n - 1) * n / 2 - gp;
    }
}