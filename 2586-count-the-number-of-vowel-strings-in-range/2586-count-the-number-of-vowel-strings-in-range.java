class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int output = 0;
        for(int i = left; i <= right; i++){
            String word = words[i];
            if(func(word.charAt(0)) && func(word.charAt(word.length() - 1))) output++;
        }
        return output;
    }
    
    public boolean func(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') return true;
        return false;
    }
}