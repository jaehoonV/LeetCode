class Solution {
    public boolean buddyStrings(String s, String goal) {
        int n = s.length();
        int gn = goal.length();
        
        if (n != gn) return false;
        
        if (s.equals(goal)) { //aa aa
            int[] arr = new int[26];
            for (char ch : s.toCharArray()) {
                arr[ch - 'a']++;
                if (arr[ch - 'a'] == 2) return true;
            }
            return false;
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                list.add(i);
                if (list.size() > 2) return false;
            }
        }
        
        return list.size() == 2 && s.charAt(list.get(0)) == goal.charAt(list.get(1)) && s.charAt(list.get(1)) == goal.charAt(list.get(0));

    }
}