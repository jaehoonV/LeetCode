class Solution {
    ArrayList<Integer> arr = new ArrayList<>();
	public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
		func(0, rooms);
		if(arr.size() == 0) return false;
		Collections.sort(arr);
		int b = arr.get(0);
		if(!(b == 0 || b == 1)) return false;
		
		for(int i = 0; i < arr.size(); i++){
			if(arr.get(i) != b) return false;
			b++;
		}
		
		return b == n ? true : false;
    }
	
	public void func(int a, List<List<Integer>> rooms) {
		for(int i = 0; i < rooms.get(a).size(); i++){
			int temp = rooms.get(a).get(i);
			if(!arr.contains(temp)){
				arr.add(temp);
				func(temp, rooms);
			}
		}
	}
}