class Solution {
    public int minBitFlips(int start, int goal) {
        String s = Integer.toBinaryString(start);
		String g = Integer.toBinaryString(goal);
		int output = 0, s_l = s.length() - 1, g_l = g.length() - 1;
		
		while(s_l >= 0 || g_l >= 0){
			if(s_l >= 0 && g_l >= 0){
				if(s.charAt(s_l) != g.charAt(g_l)) output++;
			}else if(s_l < 0 && g_l >= 0){
				if(g.charAt(g_l) != '0') output++;
			}else if(s_l >= 0 && g_l < 0){
				if(s.charAt(s_l) != '0') output++;
			}
			
			s_l--;
			g_l--;
		}
		
		return output;
    }
}