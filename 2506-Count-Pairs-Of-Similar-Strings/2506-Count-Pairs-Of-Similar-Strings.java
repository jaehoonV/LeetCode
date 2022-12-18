class Solution {
    int output = 0;
    public int similarPairs(String[] words) {
        for(int i = 0; i < words.length; i++){
            for(int j = i + 1; j < words.length; j++){
                func(words[i], words[j]);
            }
        }
        return output;
    }
    
    public void func(String s1, String s2){
        HashSet<Character> hset1 = new HashSet<>();
        HashSet<Character> hset2 = new HashSet<>();
        TreeSet<Character> set1 = new TreeSet<>();
        TreeSet<Character> set2 = new TreeSet<>();
        
        for(int i = 0; i < s1.length(); i++){
            hset1.add(s1.charAt(i));
        }
        for(int i = 0; i < s2.length(); i++){
            hset2.add(s2.charAt(i));
        }
        set1.addAll(hset1);
        set2.addAll(hset2);
        if(set1.equals(set2)) output++;
    }
}