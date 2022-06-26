class Solution {
    public String greatestLetter(String s) {
        char output = 0;

		for (int i = 0; i < s.length() - 1; i++) {
			char temp = s.charAt(i);
			boolean b = true;
			if (temp <= 90) { // 대문자일 경우
				temp += 32; // 소문자로
			} else {
				temp -= 32; // 소문자일 경우 대문자로
				b = false; // 대문자 비교를 위한 boolean값 false
			}
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(j) == temp) {
					if (output == 0) { // 비어있을 경우 A로
						output = 'A';
					}
					if (b) { // 대문자로 저장하기 위해
						output = (char) (output < temp - 32 ? temp - 32 : output);
					} else {
						output = output < temp ? temp : output;
					}
					break;
				}
			}
		}
		// String으로 변환후 반환
		return output == 0 ? "" : String.valueOf(output);
    }
}