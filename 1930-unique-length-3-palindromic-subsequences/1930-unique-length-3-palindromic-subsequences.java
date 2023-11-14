class Solution {
    public int countPalindromicSubsequence(String s) {
        		
		int output = 0;
		for(int i = 0; i < 26; i++){
			char c = (char)(i + 97);
			int start = s.indexOf(c);
			int end = s.lastIndexOf(c);
			
			if(start != -1){
				int cnt[] = new int[26];
				
				for(int j = start + 1; j < end; j++){
					cnt[s.charAt(j) - 97]++;
				}
				
				for(int k = 0; k < 26; k++){
					if(cnt[k] > 0) output++;
				}
			}
		}

		return output;
    }
}