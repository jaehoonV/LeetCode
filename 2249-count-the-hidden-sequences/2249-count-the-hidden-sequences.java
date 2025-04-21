class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        long temp = 0, max = 0, min = 0;
        for (int i = 0; i < differences.length; i++) {
            temp += differences[i];
            max = Math.max(max, temp);
            min = Math.min(min, temp);
        }
        return (int) Math.max(0, (upper - lower) - (max - min) + 1);
    }
}