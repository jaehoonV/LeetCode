class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        
        // 모스 코드 
        String[] Morse_Code = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        
        // 문자 저장 Set
        HashSet<String> s = new HashSet<>();
        for (String w : words) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < w.length(); ++i)
                sb.append(Morse_Code[w.charAt(i) - 'a']);
            s.add(sb.toString());
        }
        // set size 반환
        return s.size();
    }
}