class Solution {
    public String smallestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        List<Character> chars = new ArrayList<>(map.keySet());
        Collections.sort(chars);
        
        StringBuilder sb = new StringBuilder();
        String m = "";
        for(char c : chars){
            int cnt = map.get(c);
            if(cnt % 2 == 1) m = String.valueOf(c);
            
            for(int i = 0; i < cnt / 2; i++){
                sb.append(c);
            }
        }
        String a = sb.toString();
        String b = sb.reverse().toString();
        
        return a + m + b;
    }
}