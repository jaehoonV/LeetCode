class Solution {
    public int minLength(String s) {
        StringBuilder sb = new StringBuilder(s);
        int n = sb.length();
        
        while(true){
            for(int i = 0; i < n - 1; i++){
                if((sb.charAt(i) == 'A' && sb.charAt(i + 1) == 'B') || (sb.charAt(i) == 'C' && sb.charAt(i + 1) == 'D')){
                    sb.deleteCharAt(i);
                    sb.deleteCharAt(i);
                    break;
                }
            }
            if(n == sb.length()) break;
            else n = sb.length();
        }
        return n;
    }
}