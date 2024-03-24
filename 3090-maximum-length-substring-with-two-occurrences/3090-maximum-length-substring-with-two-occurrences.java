class Solution {
    public int maximumLengthSubstring(String s) {
        int n = s.length();
        int output = 0;
        for(int i = 0; i < n; i++){
            HashMap<Character, Integer> map = new HashMap<>();
            int cnt = 0;
            for(int j = i; j < n; j++){
                char c = s.charAt(j);
                if(map.containsKey(c)){
                    if(map.get(c) < 2){
                        map.put(c, map.getOrDefault(c, 0) + 1);
                        cnt++;
                    }else{
                        break;
                    }
                }else{
                    map.put(c, map.getOrDefault(c, 0) + 1);
                    cnt++;
                }
            }
            output = Math.max(output, cnt);
        }
                   
        return output;
    }
}