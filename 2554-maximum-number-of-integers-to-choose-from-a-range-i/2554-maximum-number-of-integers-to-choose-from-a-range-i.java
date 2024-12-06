class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int output = 0;
		long sum = 0;

        int[] temp = new int[10001];
        for(int i = 0; i < banned.length; i++){
            temp[banned[i]] = 1;
        }

		for(int i = 1; i <= n; i++){
			if(temp[i] == 1) continue;
			
			sum += i;
			if(sum > maxSum) return output;
			output++;
		}
		return output;
    }
}