class Solution {
    public int minimumLengthEncoding(String[] words) {
        // 중복제거하는 HashSet에 words 담기
        Set<String> set = new HashSet<>(Arrays.asList(words));
        int output = 0;
        
        // substring한 words가 Set에 있으면 제거
        for (String w : words) {
            for (int i = 1; i < w.length(); ++i) {
                set.remove(w.substring(i));
            }
        }
        
        // Set에담긴 String들의 길이와 '#'길이인 1을 더하여 반환 
        for (String s : set) {
            output += s.length() + 1;
        }
        return output;
    }
}