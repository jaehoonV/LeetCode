class Solution {
    public boolean isAcronym(List<String> words, String s) {
        int a = words.size();
        int b = s.length();
        
        if(a != b) return false;
        
        for(int i = 0; i < a; i++){
            if(words.get(i).charAt(0) != s.charAt(i)) return false;
        }
        
        return true;
    }
}