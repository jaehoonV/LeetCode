class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0, n = s.length();
        if(n == 0) return true;
		
		while(j < t.length()){
			if(s.charAt(i) == t.charAt(j)){
                i++;
                
                if(n == i) return true;
            }
			j++;
		}
		
		return n == i;
    }
}