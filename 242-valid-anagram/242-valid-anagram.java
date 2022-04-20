class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s_arr = s.toCharArray();
		char[] t_arr = t.toCharArray();
		
		if(s_arr.length != t_arr.length) return false;
		
		Arrays.sort(s_arr);
		Arrays.sort(t_arr);

		for (int i = 0; i < s_arr.length; i++)
			if (s_arr[i] != t_arr[i])
				return false;

		return true;
    }
}