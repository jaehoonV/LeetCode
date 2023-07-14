class Solution {
    public int longestSubsequence(int[] arr, int dif) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int output = 0;
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            if (map.containsKey(a - dif)) map.put(a, map.get(a - dif) + 1);
            else map.put(a, 1);
            output = Math.max(output, map.get(a));
        }
        return output;
    }
}