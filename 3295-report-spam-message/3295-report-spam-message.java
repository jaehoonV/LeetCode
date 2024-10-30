class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        int t = 0;
        HashSet<String> set = new HashSet<>();
        
        for (String b : bannedWords) {
            set.add(b);
        }
        
        for(String m : message){
            if (set.contains(m)) {
                t++;
                if(t == 2) return true;
            }
        }
        return false;
    }
}
