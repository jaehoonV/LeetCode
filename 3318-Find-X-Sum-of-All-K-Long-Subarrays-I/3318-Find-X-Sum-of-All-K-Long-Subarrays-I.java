class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] output = new int[n - k + 1];
            
        for(int i = 0; i <= n - k; i++){
            Map<Integer, Integer> map = new HashMap<>();
            for(int j = i; j < i + k; j++){
                 map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
            }
            
            List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
            entryList.sort((a, b) -> {
                if (b.getValue().equals(a.getValue())) {
                    return Integer.compare(b.getKey(), a.getKey());
                }
                return Integer.compare(b.getValue(), a.getValue());
            });
            
            int sum = 0;
            
            for (int j = 0; j < Math.min(x, entryList.size()); j++) {
                sum += entryList.get(j).getKey() * entryList.get(j).getValue();
            }
            
            output[i] = sum;
        }
        
        return output;
    }
}