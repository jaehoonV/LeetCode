class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int output = 0, n = colors.length;
		
		if(colors[1] == colors[n - 1] && colors[0] != colors[1]) output++;
		if(colors[0] == colors[n - 2] && colors[0] != colors[n - 1]) output++;
		
		for(int i = 1; i < n - 1; i++){
			if(colors[i + 1] == colors[i - 1] && colors[i] != colors[i - 1]) output++;
		}
		
		return output;
    }
}