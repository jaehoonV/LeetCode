class Solution {
    public String convertToTitle(int c) {
        String s = "";
        while(c > 0){
            c--;
            s = (char)(c % 26 + 'A') + s;
            c = c / 26;
        }
        return s;
    }
}
