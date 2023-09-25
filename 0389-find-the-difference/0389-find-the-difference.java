class Solution {
    public char findTheDifference(String s, String t) {
        int[] arr = new int[27];
		
		for(char c : s.toCharArray()){
			arr[c - 97]++;
		}
		
		for(char c : t.toCharArray()){
			if(arr[c-97] == 0) return c;
			else arr[c - 97]--;
		}
		return 'a';
    }
}