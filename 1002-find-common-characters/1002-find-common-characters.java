class Solution {
    public List<String> commonChars(String[] words) {
        char[] arr = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		List<String> output = new ArrayList<>();
		for(char c : arr){
			int cnt = Integer.MAX_VALUE;
			for(String s : words){
				cnt = Math.min(cnt, count(s, c));
			}
			
			String temp = String.valueOf(c);
			for(int i = 0 ; i < cnt; i++){
				output.add(temp);
			}
		}
		
		return output;
    }
	
	public int count(String str, char ch) {        
		return str.length() - str.replace(String.valueOf(ch), "").length();
	}
}