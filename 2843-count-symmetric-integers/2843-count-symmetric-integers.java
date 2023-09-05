class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int output = 0;
        for (int i = low; i <= high; i++) {
            String s = Integer.toString(i);
            int temp = 0, n = s.length();
            for (int j = 0; j < n / 2; j++) { 
                temp += s.charAt(j) - s.charAt(n - j - 1);
            }
            if (n % 2 == 0 && temp == 0)  output++;
        }
        return output;
    }
}