class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int max = 0, temp = 0;
	    Set<Integer> set = new HashSet<>();

	    for (int i = 0, j = 0; j < nums.length; j++) {
		    while (!set.add(nums[j])) {
			    temp -= nums[i];
			    set.remove(nums[i++]);
		    }
		    temp += nums[j];
		    max = Math.max(max, temp);
	    }
	return max;
    }
}