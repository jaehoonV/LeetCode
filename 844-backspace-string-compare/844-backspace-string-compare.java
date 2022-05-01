class Solution {
    public boolean backspaceCompare(String s, String t) {
        char[] s_arr = s.toCharArray();
        char[] t_arr = t.toCharArray();
        
        String sb_s = make_sb(s_arr);
        String sb_t = make_sb(t_arr);
        
        return sb_s.equals(sb_t);
    }
	
	private String make_sb(char[] arr) {
		StringBuilder sb = new StringBuilder();
		
		for(char c : arr){
            if(c == '#'){ // #일 경우 마지막 문자 제거
            	if(sb.length() != 0) {
            		sb.deleteCharAt(sb.length()-1);
            	}
            } else { // c append
                sb.append(Character.toString(c));
            }
        }
		return sb.toString(); // String으로 반환
	}
}