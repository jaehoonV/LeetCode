class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set set = new HashSet();
        Set output = new HashSet();

        for (int i = 0; i < s.length() - 9; i++) {
            String temp = s.substring(i, i + 10);
            if(!set.add(temp)) output.add(temp);
        }
        
        return new ArrayList(output);
    }
}