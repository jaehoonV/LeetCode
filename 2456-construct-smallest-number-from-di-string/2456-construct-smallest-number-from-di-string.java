class Solution {
    public String smallestNumber(String pattern) {
        int n = pattern.length();
        StringBuilder output = new StringBuilder();
        int[] temp = new int[n + 1]; 
        int index = 0;

        for (int i = 0; i <= n; i++) {
            temp[index++] = i + 1;

            if (i == n || pattern.charAt(i) == 'I') {
                while (index > 0) {
                    output.append(temp[--index]);
                }
            }
        }

        return output.toString();
    }
}