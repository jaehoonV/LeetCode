class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int a = -1, b = -1, cnt = 0, max_c = 0, output = 0;

        for (int i = 0; i < n; i++) {
            int f = fruits[i];

            if (f == a || f == b) {
                max_c++;
            } else {
                max_c = cnt + 1;
            }

            if (f == a) {
                cnt++;
            } else {
                cnt = 1;
                b = a;
                a = f;
            }

            output = Math.max(output, max_c);
        }

        return output;
    }
}