class Solution {
    public int residuePrefixes(String s) {
        int output = 0;
        HashSet<Character> set=new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            set.add(s.charAt(i));
            if((i + 1) % 3 == set.size()) output++;
        }   
        return output;
    }
}