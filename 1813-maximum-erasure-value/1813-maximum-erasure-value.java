class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int output = 0, temp = 0;
	    Set<Integer> set = new HashSet<>();

	    for (int i = 0, j = 0; j < nums.length; j++) {
		    while (!set.add(nums[j])) {
			    temp -= nums[i];
			    set.remove(nums[i++]);
		    }
		    temp += nums[j];
		    output = Math.max(output, temp);
	    }
	return output;
    }
}