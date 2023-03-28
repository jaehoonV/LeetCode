class Solution {
    public int[] evenOddBit(int n) {
        String s = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String s_ = sb.toString();
        int a = 0, b = 0;
        for(int i = 0; i < s_.length(); i++){
            if(s_.charAt(i) == '1'){
                if(i % 2 == 0) b++;
                else a++;
            }
        }
        return new int[]{b, a};
    }
}