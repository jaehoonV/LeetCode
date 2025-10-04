class Solution {
    public int maxArea(int[] height) {
        int output = 0;
		int i = 0;
		int j = height.length - 1;

		while(i < j) {
			output = Math.max(output,  Math.min(height[i], height[j]) * (j - i));

			if(height[i] < height[j]) i++;
			else if(height[i] > height[j]) j--;
			else {
				i++;
				j--;
			}
		}
		return output;
    }
}