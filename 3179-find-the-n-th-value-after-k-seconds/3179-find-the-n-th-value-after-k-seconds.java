class Solution {
    public int valueAfterKSeconds(int n, int k) {
        int[] arr = new int[n];
		Arrays.fill(arr, 1);
		
		for(int i = 0; i < k; i++){
			for(int j = 1; j < n; j++){
				arr[j] = (arr[j] + arr[j - 1]) % 1000000007;
			}
		}
		
		return arr[n - 1];
    }
}