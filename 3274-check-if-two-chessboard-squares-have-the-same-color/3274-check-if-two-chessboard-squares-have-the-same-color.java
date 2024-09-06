class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        int s1 = (coordinate1.charAt(0) - 'a') % 2;
		int s2 = (coordinate2.charAt(0) - 'a') % 2;
		int n1 = (coordinate1.charAt(1) - '0') % 2;
		int n2 = (coordinate2.charAt(1) - '0') % 2;
		
		boolean s_bool = s1 == s2;
		boolean n_bool = n1 == n2;
		
		return (s_bool && n_bool) || (!s_bool && !n_bool);
    }
}