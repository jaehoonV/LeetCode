class Solution {
    public String frequencySort(String s) {
        String output = "";
        Map<Character, Integer> hm = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
        }
        
        List<Character> keySetList = new ArrayList<>(hm.keySet());
        
        Collections.sort(keySetList, (o1, o2) -> (hm.get(o2).compareTo(hm.get(o1))));
		for(Character key : keySetList) {
            for(int i = 0; i < hm.get(key); i++){
			    output += key ;
            }
		}
        return output;
    }
}