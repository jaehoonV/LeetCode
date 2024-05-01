class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if (index == -1) return word;
        
        StringBuilder output = new StringBuilder(word.substring(0, index + 1)).reverse();
        if (index < word.length()) output.append(word.substring(index + 1));
        
        return output.toString();
    }
}