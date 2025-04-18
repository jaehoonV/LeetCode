class Solution {
    public String countAndSay(int n) {
        String output = "1";
        for (int i = 1; i < n; i++) {
            StringBuilder temp = new StringBuilder();
            int cnt = 1;
            int l = output.length();
            for (int j = 1; j < l; j++) {
                if (output.charAt(j) == output.charAt(j - 1)) {
                    cnt++;
                } else {
                    temp.append(cnt).append(output.charAt(j - 1));
                    cnt = 1;
                }
            }
            temp.append(cnt).append(output.charAt(l - 1));
            output = temp.toString();
        }

        return output;
    }
}