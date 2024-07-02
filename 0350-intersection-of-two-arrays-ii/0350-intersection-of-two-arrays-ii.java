class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
		ArrayList<Integer> output = new ArrayList<>();
        HashMap<Integer, Integer> nums1_map = new HashMap<>();
		HashMap<Integer, Integer> nums2_map = new HashMap<>();
		
		for(int n : nums1){
			nums1_map.put(n, nums1_map.getOrDefault(n, 0) + 1);
		}
		
		for(int n : nums2){
			nums2_map.put(n, nums2_map.getOrDefault(n, 0) + 1);
		}
		
		Set set = nums1_map.keySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext()){
			
			int key = (Integer) iterator.next();
			if(nums2_map.containsKey(key)){
				int cnt = Math.min(nums1_map.get(key), nums2_map.get(key));
				
				for(int i =0; i < cnt; i++){
					output.add(key);
				}
			}
		}
		return output.stream().mapToInt(i -> i).toArray();
    }
}