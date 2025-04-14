class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int output = 0, n = arr.length;
		
		for(int i = 0; i < n - 2; i++){
			for(int j = i + 1; j < n - 1; j++){
				for(int k = j + 1; k < n; k++){
					int ij = Math.abs(arr[i] - arr[j]);
					int jk = Math.abs(arr[j] - arr[k]);
					int ik = Math.abs(arr[i] - arr[k]);
					if(ij <= a && jk <= b && ik <= c) output++;
				}
			}
		}
		
		return output;
    }
}