class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int r_lang = rolls.length;
		int sum = mean * (r_lang + n);
		int rolls_sum = 0;
		for(int r : rolls) rolls_sum += r;
		
		sum -= rolls_sum;
		if(sum > 6 * n || sum < n) return new int[]{};
		
		int[] output = new int[n];
		Arrays.fill(output, 1);
		int i = 0, n_sum = n;
		
		while(n_sum < sum){
			if(i == n) return new int[]{};
			if(output[i] < 6){
				output[i] += 1;
				n_sum++;
			}else{
				i++;
			}
		}
		
		return output;
    }
} 