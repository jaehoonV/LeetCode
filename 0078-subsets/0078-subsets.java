class Solution {
	List<List<Integer>> output;
	
    public List<List<Integer>> subsets(int[] nums) {
        output = new ArrayList<>();
		
        List<Integer> temp = new ArrayList<>();
        func(nums, 0, temp);
        return output;
    }

    public void func(int[] nums, int start, List<Integer> temp) {
        if (nums.length == start) {
            output.add(new ArrayList<>(temp));
            return;
        }
        
        func(nums, start + 1, temp);
        temp.add(nums[start]);
        func(nums, start + 1, temp);
        temp.remove(temp.size() - 1);
    }
}