class Solution {
    public int minimumFlips(int n) {
        String s = Integer.toBinaryString(n);
        int output = 0, l = s.length() - 1, a = 0;
        while(a < l) {
            if(s.charAt(a++) != s.charAt(l--)) output++;
        }

        return output * 2;
    }
}