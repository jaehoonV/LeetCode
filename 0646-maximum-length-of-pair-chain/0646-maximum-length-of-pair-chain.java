class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, Comparator.comparingInt(a -> a[1]));

        int[] temp = pairs[0];
        int output = 1;

        for (int i = 1; i < pairs.length; i++) {
            int[] compare = pairs[i];
            if (compare[0] > temp[1]) {
                output++;
                temp = compare;
            }
        }

        return output;   
    }
}