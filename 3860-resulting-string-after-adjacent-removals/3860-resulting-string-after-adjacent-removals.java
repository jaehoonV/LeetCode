class Solution {
    public String resultingString(String s) {
        StringBuilder sb = new StringBuilder();
        
        for(char c : s.toCharArray()) {
            int l = sb.length();
            if(l > 0) {
                char t = sb.charAt(l - 1);
                int d = Math.abs(t - c);
                
                if(d == 1 || d == 25) {
                    sb.deleteCharAt(l - 1);
                    continue;
                }
            }
            sb.append(c); 
        }

        return sb.toString();
    }
}