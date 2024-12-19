class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n = arr.length, output = 0, max = 0;
        if (n == 0) return 0;

        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
            if (max == i) output++;
        }

        return output;
    }
}