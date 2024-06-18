class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int output = 0, n = difficulty.length;
		int[][] d_p = new int[n][2];
		
		for(int i = 0; i < n; i++){
			d_p[i][0] = difficulty[i];
			d_p[i][1] = profit[i];
		}
		
		Arrays.sort(d_p, (o1, o2) -> {return o1[0] - o2[0];});
		
		for(int i = 0; i < worker.length; i++){
			int max_profit = 0;
			int w = worker[i];
			for(int j = 0; j < n; j++){
				if(w >= d_p[j][0]){
					max_profit = Math.max(max_profit, d_p[j][1]);
				}else{
					break;
				}
			}
			output += max_profit;
		}
		
		return output;
    }
}