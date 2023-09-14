class Solution {
    public int minimumSum(int n, int k) {
        Set<Integer> st = new HashSet<>();
        int output = 0;
        for (int i = 1; st.size() < n; i++) {
            if (!st.contains(k - i)) {
                st.add(i);
                output += i;
            }
        }
        return output;
    }
}