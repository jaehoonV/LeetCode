class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        int output = 0; // 카운트할 변수
		
		// words 중복 제거
		Map<String, Integer> map = new HashMap<>();
		for (String str : words) {
			map.put(str, map.getOrDefault(str, 0) + 1);
		}
		
		// s (String to Char[])
		char ch[] = s.toCharArray();

		for (String str : map.keySet()) {
			// str (String to Char[])
			char temp[] = str.toCharArray();
			int i = 0; // ch index
			int j = 0; // temp index

			while (i < ch.length && j < temp.length) {
				if (ch[i] == temp[j]) { // 같을 경우  
					i++;
					j++;
				} else {
					i++;
				}
			}

			if (j == temp.length) { // temp가 모두 있을 경우
				output += map.get(str); // value값 더함
			}
		}
		return output;
    }
}