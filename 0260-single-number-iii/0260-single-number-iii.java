class Solution {
    public int[] singleNumber(int[] nums) {
        List<Integer> output = new ArrayList<>();
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int n : nums) hm.put(n, hm.getOrDefault(n, 0) + 1);
		
		Set<Integer> keySet = hm.keySet();        
		for (Integer key : keySet) {
			if(hm.get(key) == 1)output.add(key);
		}
		
		int[] result = new int[output.size()];
        for(int i = 0; i < output.size(); i++) {
            result[i] = output.get(i);
        }

        return result;
    }
}