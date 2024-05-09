class Solution {
    public boolean isValid(String word) {
        if(word.length() < 3) return false;
        
        int cnt1 = 0, cnt2 = 0;
        String s = word.toUpperCase();
        
        for(char c : s.toCharArray()){
            if(c >= 48 && c <= 57){ // Number
                continue;
            }else if(c >= 65 && c <= 90){ // English
                if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                    cnt1++;
                }else{
                    cnt2++;
                }
            }else{
                return false;
            }
        }
        
        return cnt1 > 0 && cnt2 > 0;
    }
}