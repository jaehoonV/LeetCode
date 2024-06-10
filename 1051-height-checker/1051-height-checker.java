class Solution {
    public int heightChecker(int[] heights) {
        int output = 0;
		int[] temp = heights.clone();
        Arrays.sort(temp);
		
		for(int i = 0; i < heights.length; i++){
			if(heights[i] != temp[i]) output++;
		}
		return output;
    }
}