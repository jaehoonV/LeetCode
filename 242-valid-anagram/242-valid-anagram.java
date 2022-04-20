class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {// 길이가 같지 않을 경우 false 반환
			return false;
		}
		int[] count = new int[26]; // 알파벳 소문자 수 만큼 count할 배열 생성
		for (int i = 0; i < s.length(); i++) {
			count[s.charAt(i) - 'a']++; // s에 있는 문자는 +1
			count[t.charAt(i) - 'a']--; // t에 있는 문자는 -1
		}
		// count배열에 0이 아닌 수가 있다면 s, t가 Anagram이 아닌 경우이므로 false 반환 
		for (int i : count) { 
			if (i != 0) {
				return false;
			}
		}
		return true;
    }
}