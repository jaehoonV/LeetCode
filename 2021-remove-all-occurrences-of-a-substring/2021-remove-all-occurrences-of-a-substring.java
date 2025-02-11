class Solution {
    public String removeOccurrences(String s, String part) {
        int n = s.length(), p = part.length();
        int i = s.indexOf(part);

        while(i != -1) {
            s = s.substring(0, i) + s.substring(i + p);
            n -= p;
            i = s.indexOf(part);
        }

        return s;
    }
}