class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        ArrayList<List<Integer>> output = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int n : nums) map.put(n, map.getOrDefault(n, 0) + 1);
		Set<Integer> keySet = map.keySet();
		
		while(func(map)){
			ArrayList<Integer> temp_arr = new ArrayList<>();
			for(Integer key : keySet) {
				if(map.get(key) > 0){
					temp_arr.add(key);
					map.put(key, map.get(key) - 1);
				}
			}
			output.add(temp_arr);
		}
		return output;
    }
	
	public boolean func(Map<Integer,Integer> map){
        for(int key : map.keySet()) if(map.get(key) > 0) return true;
        return false;
    }
}