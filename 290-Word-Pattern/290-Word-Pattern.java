class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        HashMap<Character, String> hm = new HashMap<>();

        if(pattern.length() != arr.length) return false;

        for(int i = 0; i < arr.length; i++){
            if(hm.containsKey(pattern.charAt(i))){
                if(!hm.get(pattern.charAt(i)).equals(arr[i])){
                    return false;
                }
            } else{
                hm.put(pattern.charAt(i), arr[i]);
            }
        }

        HashSet<String> hs = new HashSet<>();
        for (char key : hm.keySet()) {
            hs.add(hm.get(key));
        }

        return hs.size() == hm.size() ? true : false;
    }
}