class Solution {
    public char kthCharacter(int k) {
        String word = "a";
        
        while(word.length() < k){
            String temp = "";
            for(char c : word.toCharArray()){
                temp += func(c);
            }
            word += temp;
        }
        return word.charAt(k - 1);
    }
    
    public String func(char c){
        if(c == 122) return "a";
        return "" + (char)(c + 1);
    }
}