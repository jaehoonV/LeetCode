class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
		ArrayList<Integer> list = new ArrayList<>();
		for(String s : nums){
			list.add(Integer.parseInt(s, 2));
		}
		
		Collections.sort(list);
		int i = 0;
		int output = -1;
		while(i < n){
			if(i != list.get(i)) {
				output = i;
				break;
			}
			
			i++;
		}
		
		if(output == -1) output = list.get(n - 1) + 1;
		
		String s_output = Integer.toBinaryString(output);
		int diff = n - s_output.length();
		String diff_0 = "";
		if(diff > 0){
			for(int j = 0; j < diff; j++){
				diff_0 += "0";
			}
		}
		
		return diff_0 + s_output;
    }
}
