class Solution {
    public int numberOfSpecialChars(String word) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        int n = word.length(), output = 0;
        for(int i = 0; i < n; i++){
            char c = word.charAt(i);
            
            if(c >= 'a' && c <= 'z') {
                map1.put(c, i);
            }else{
                if(!map2.containsKey(c)) map2.put(c, i);
            }
        }
        
        Set keys = map1.keySet();
        Iterator iterator = keys.iterator();
        while(iterator.hasNext()){
            char key = (char) iterator.next();
            char upper_key = Character.toUpperCase(key);
            if(map2.containsKey(upper_key)){
                if(map1.get(key) < map2.get(upper_key)) output++;
            }
        }
        
        return output;
        
    }
}