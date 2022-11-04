class Solution {
    public String reverseVowels(String s) {
		String check = "aeiouAEIOU"; // 모음 체크
		StringBuilder sb1 = new StringBuilder(); // 자음
		StringBuilder sb2 = new StringBuilder(); // 모음
		char[] s_char = s.toCharArray();
		
		for(int i = 0; i < s_char.length; i++){
            // 모음 체크
			if(check.contains(Character.toString(s_char[i]))){
				sb1.append("~");
				sb2.append(s_char[i]);
			}else{
				sb1.append(s_char[i]);
			}
		}
		sb2 = sb2.reverse(); // 모음 reverse
		int k = 0;
		for(int i = 0; i < s_char.length; i++){
			if(sb1.charAt(i) == '~'){ // 모음 set
				sb1.setCharAt(i, sb2.charAt(k++));
			}
		}
		return sb1.toString();
    }
}
