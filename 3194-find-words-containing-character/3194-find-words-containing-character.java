class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> output = new ArrayList<>();
        String s = x + "";
        
        for(int i = 0; i < words.length; i++){
            if(words[i].contains(s)) output.add(i);
        }
        return output;
    }
}