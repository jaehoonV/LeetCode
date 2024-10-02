class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        if(n == 0) return new int[]{};
		int[] output = new int[n];
        Map<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < n; i++){
			map.put(i, arr[i]);
		}
		
		List<Map.Entry<Integer, Integer>> entryList = new LinkedList<>(map.entrySet());
		entryList.sort(Map.Entry.comparingByValue());
		int rank = 1;
		int temp = entryList.get(0).getValue();
		for(Map.Entry<Integer, Integer> entry : entryList){
			int key = entry.getKey();
			int value = entry.getValue();
			
			if(temp != value){
				rank++;
				temp = value;
			}
			
			output[key] = rank;
			
		}
		
		return output;
    }
}