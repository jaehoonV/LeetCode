class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permute = new ArrayList<>();
        
        backtrack(permute, new ArrayList<>(), nums);
        
        return permute;
    }
    
    public void backtrack(List<List<Integer>> permute, List<Integer> tempList, int[] nums) {
		if (tempList.size() == nums.length) {
			permute.add(new ArrayList<>(tempList)); 
		} else {
			for (int i = 0; i < nums.length; i++) {
				if (tempList.contains(nums[i])) continue; 
				tempList.add(nums[i]);
				backtrack(permute, tempList, nums); 
				tempList.remove(tempList.size() - 1);
			}
		}
	}
}