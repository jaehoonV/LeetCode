class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> output = new ArrayList<>();
		int n = words.length;
		Arrays.sort(words, (String s1, String s2) -> s1.length() - s2.length());
		
		for(int i = 0; i < n - 1; i++){
			String s = words[i];
			
			for(int j = i + 1; j < n; j++){
				if(words[j].contains(s)){
					output.add(s);
					break;
				}
			}
		}
		return output;
    }
}