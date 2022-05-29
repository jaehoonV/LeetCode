class Solution {
    public int maxProduct(String[] words) {
        int answer = 0;
		
		String[] temp_words = new String[words.length];
		
		// 비교하기 위한 반복
		for (int i = 0; i < words.length; i++) {
			int n = words[i].length();
			String[] word_arr1 = new String[n];
			for (int j = 0; j < n; j++) {
				word_arr1[j] = String.valueOf(words[i].charAt(j));
			}
			HashSet<String> hS1 = new HashSet<>(Arrays.asList(word_arr1));
			temp_words[i] = String.join("", hS1.toArray(new String[0]));
		}
		
		for (int i = 0; i < temp_words.length - 1; i++) {
			for (int j = i + 1; j < temp_words.length; j++) {
				if(words[i].length() * words[j].length() > answer) {
					if(solution(temp_words[i], temp_words[j])) {
						answer = Math.max(answer, words[i].length() * words[j].length());
					}
				}
			}
		}

		return answer;
	}

	private boolean solution(String word_first, String word_second) {

		// String 배열 생성
		String[] word_arr2 = new String[word_second.length()];
		for (int i = 0; i < word_second.length(); i++) {
			word_arr2[i] = String.valueOf(word_second.charAt(i));
		}

		// contains로 포함하는지 확인
		for (int i = 0; i < word_arr2.length; i++) {
			if (word_first.contains(word_arr2[i])) {
				return false;
			}
		}

		// 포함되지 않으면 true 반환
		return true;
	}
    
}