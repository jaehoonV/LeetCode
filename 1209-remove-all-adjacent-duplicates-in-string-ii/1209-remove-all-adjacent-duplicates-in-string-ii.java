class Solution {
    public String removeDuplicates(String s, int k) {
        
		char[] s_arr = s.toCharArray();
		int[] count = new int[s.length()]; // 반복 횟수 저장

		StringBuilder sb = new StringBuilder();

		for (char temp : s_arr) {
			sb.append(temp);
			int i = sb.length() - 1; //마지막 인덱스
			// 이전 문자와 같을 경우 반복 횟수를 증가시키며 count[]에 저장 
			count[i] = 1 + (i > 0 && sb.charAt(i) == sb.charAt(i - 1) ? count[i - 1] : 0);
			if (count[i] >= k) { // count가 k 이상일 경우
				sb.delete(sb.length() - k, sb.length()); // 뒤에서 k번째까지 제거
			}
		}

		return sb.toString(); // String형으로 반환
    }
}