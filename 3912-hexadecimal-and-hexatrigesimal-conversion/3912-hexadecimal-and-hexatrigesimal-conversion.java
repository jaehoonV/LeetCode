class Solution {
    public String concatHex36(int n) {
        long n2 = (long) n * n;
        long n3 = (long) n * n * n;

        String a = Long.toHexString(n2).toUpperCase();

        String b = "";
        while(n3 > 0) {
            long temp = n3 % 36;
            char c;
            if(temp < 10) c = (char) ('0' + temp);
            else c = (char) ('A' + temp - 10);
            b = c + b;
            n3 /= 36;
        }

        return a + b;
    }
}