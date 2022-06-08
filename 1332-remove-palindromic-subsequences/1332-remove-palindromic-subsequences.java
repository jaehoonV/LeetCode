class Solution {
    public int removePalindromeSub(String s) {
        int a = 0;
        int b = s.length()-1;
        
        while(a < b){
            if(s.charAt(a) != s.charAt(b)){
                return 2;
            }
            a++;
            b--;
        }
        return 1;
    }
}