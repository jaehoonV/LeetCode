class Solution {
    public String getSmallestString(String s) {
        char[] c = s.toCharArray();
        for(int i = 0; i < c.length - 1; i++){
            if((c[i] - '0') % 2 == (c[i + 1] - '0') % 2 && c[i] > c[i+1]){
                char temp = c[i];
                c[i] = c[i + 1];
                c[i + 1] = temp;
                break;
            }
        }
        
        return new String(c);
    }
}