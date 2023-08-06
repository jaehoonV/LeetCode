class Solution {
    public String finalString(String s) {
        StringBuilder sb = new StringBuilder();
        char[] charArr = s.toCharArray();
        for(char c : charArr){
            if(c == 'i') sb.reverse();
            else sb.append(c);
        }
        
        return sb.toString();
    }
}