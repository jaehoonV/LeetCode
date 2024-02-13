class Solution {
    public String firstPalindrome(String[] words) {
        for(String s : words){
            if(s.equals(new StringBuffer(s).reverse().toString())) return s;
        }
        return "";
    }
}