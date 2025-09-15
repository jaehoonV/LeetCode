class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int output = 0, cnt = 0;
        
        for(String s : text.split(" ")){
            ArrayList<Character> list = new ArrayList<>();
            cnt = 0;
            
            for(char c : s.toCharArray()){
                list.add(c);
            }
            
            for(char c : brokenLetters.toCharArray()){
                if(list.contains(c)) cnt++;
            }
            
            if(cnt == 0) output++;

         }
         return output;
    }
}