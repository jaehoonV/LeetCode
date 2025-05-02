class Solution {
    public String pushDominoes(String dominoes) {
        char[] output = dominoes.toCharArray();
        int n = output.length;
        int r = -1, l = 0;

        for (int i = 0; i < n; i++) {
            char c = output[i];
            if (c == 'R') {
                if (r != -1) {
                    for (int j = r + 1; j < i; j++) {
                        output[j] = 'R';
                    }
                }
                r = i;
            } else if (c == 'L') {
                if (r != -1) {
                    int t_l = r + 1, t_r = i - 1;
                    while (t_l < t_r) {
                        output[t_l++] = 'R';
                        output[t_r--] = 'L';
                    }
                    r = -1;
                } else {
                    for (int j = l; j < i; j++) {
                        output[j] = 'L';
                    }
                }
                l = i;
            }
        }

        if (r != -1) {
            for (int i = r + 1; i < n; i++) {
                output[i] = 'R';
            }
        }

        return new String(output);
    }
}