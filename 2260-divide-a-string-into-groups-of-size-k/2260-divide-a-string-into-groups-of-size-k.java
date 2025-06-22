class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length();
        int l = (n + k - 1) / k;
        String[] output = new String[l];
        
        for (int i = 0; i < l; i++) {
            StringBuilder temp = new StringBuilder();
            for (int j = 0; j < k; j++) {
                int index = i * k + j;
                if (index < n) {
                    temp.append(s.charAt(index));
                } else {
                    temp.append(fill);
                }
            }
            output[i] = temp.toString();
        }
        
        return output;
    }
}