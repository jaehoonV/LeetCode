class Solution {
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
        int[] arr = new int[n];
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + ((nums[i] - nums[i - 1]) > maxDiff ? 1 : 0);
        }

        int j = 0;
        boolean[] output = new boolean[queries.length]; 
        for (int[] q: queries) {
            output[j++] = (arr[q[0]] == arr[q[1]]);
        }
        return output;
    }
}