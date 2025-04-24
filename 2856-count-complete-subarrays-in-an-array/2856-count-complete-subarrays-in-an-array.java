class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
		
		for(int n : nums){
			set.add(n);
		}
		
		int cnt = set.size();
		int l = nums.length;
		int output = 0;
		
		for(int i = 0; i < l; i++){
			set.clear();
			for(int j = i; j < l; j++){
				set.add(nums[j]);
				if(cnt == set.size()) output++;
			}
		}
		
		return output;
    }
}