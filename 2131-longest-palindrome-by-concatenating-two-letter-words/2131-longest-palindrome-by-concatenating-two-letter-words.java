class Solution {
    public int longestPalindrome(String[] words) {
        int n = words.length;
        int output = 0;
        boolean b = true;
        HashMap<String, Integer> hm = new HashMap<>();

        for(int i = 0; i < n; i++){
            StringBuilder sb = new StringBuilder(words[i]);
            String s1 = sb.toString();
            String s2 = sb.reverse().toString();
            
            if(hm.containsKey(s2)){
                output += 4;
                hm.put(s2, hm.get(s2) - 1);
                if(hm.get(s2) == 0){
                    hm.remove(s2);
                }
            } else {
                hm.put(s1, hm.getOrDefault(s1, 0) + 1);
            }
        }

        Iterator<Map.Entry<String, Integer>> itr = hm.entrySet().iterator();

	    while(itr.hasNext()){
		    Map.Entry<String, Integer> entry = itr.next();
            int val = entry.getValue();
            if(val % 2 != 0){
                String key = entry.getKey();
                if(key.charAt(0) == key.charAt(1)){
                    output += 2;
                    break;
			    }
            }
        }
	    return output;
    }
}