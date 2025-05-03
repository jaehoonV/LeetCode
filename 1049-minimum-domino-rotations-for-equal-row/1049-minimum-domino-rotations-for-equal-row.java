class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        
        int[] count_tops = new int[6];
		int[] count_bottoms = new int[6];
		int[] same_num = new int[6];
		int output = -1;
		int leng = tops.length;
		
		for(int i = 0; i < leng; i++) {
			count_tops[tops[i]-1]++;
			count_bottoms[bottoms[i]-1]++;
			
			if(tops[i] == bottoms[i]) {
				same_num[tops[i]-1]++;
			}
		}
		
		for(int i = 0; i < same_num.length; i++) {
			if(count_tops[i] + count_bottoms[i] - same_num[i] == leng ) {
				output =  leng - Math.max(count_tops[i], count_bottoms[i]);
			}
		}
		return output;
    }
}